package com.spring.study.primary.stream;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-10 7:45
 */
public class ComposeTest {
    public static void main(String[] args) {
        Function<Integer, Integer> times2 = e -> e * 2;
        Function<Integer, Integer> squared = e -> e * e;

        // compose先执行参数，后执行调用者
        System.out.println(times2.compose(squared).apply(4));
        // andThen先执行调用者，后执行参数
        System.out.println(times2.andThen(squared).apply(4));

        BiFunction<String, List<Article>, List<Article>> byAuthor =
                (name, articles) -> articles.stream()
                        .filter(a -> a.getAuthor().equals(name)).collect(Collectors.toList());
        BiFunction<String, List<Article>, List<Article>> byTag =
                (tag, articles) -> articles.stream()
                .filter(a -> a.getTags().contains(tag)).collect(Collectors.toList());

        Function<List<Article>, List<Article>> sortByDate =
                articles -> articles.stream()
                        .sorted((x, y) -> y.getPublished().compareTo(x.getPublished()))
                        .collect(Collectors.toList());

        Function<List<Article>, Optional<Article>> first =
                a -> a.stream().findFirst();

        Function<List<Article>, Optional<Article>> newest =
                first.compose(sortByDate);
        BiFunction<String, List<Article>, Optional<Article>> newestByAuthor =
                byAuthor.andThen(newest);

        BiFunction<String, List<Article>, List<Article>> byAuthorSorted =
                byAuthor.andThen(sortByDate);

        BiFunction<String, List<Article>, Optional<Article>> newestByTag =
                byTag.andThen(newest);
    }
}


class Article {
    private String author;
    private List<String> tags;
    public Date published;

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
