package com.fiora.study.stream;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-10 7:30
 */
public class FilterAndPredicateTest {
    public static void main(String[] args) {
        // method1
        Stream.of(1, 2, 3, 4, 5, 6, 7).filter(((Predicate<? super Integer>) c -> c % 2 == 0).negate()).forEach(System.out::print);

        // method2
        Stream.of(1, 2, 3, 4, 5, 6, 7).filter(not(c -> c % 2 == 0)).forEach(System.out::print);
        Stream.of("Cat", "", "Dog").filter(predicate(String::isEmpty).negate()).forEach(System.out::print);

        // method3
        Stream.of(1, 2, 3, 4, 5, 6, 7).filter((c -> c % 2 != 0)).forEach(System.out::println);
        Stream.of("Cat", "", "Dog").filter(str -> !str.isEmpty()).forEach(System.out::println);
    }


    public static <R> Predicate<R> not(Predicate<R> predicate) {
        return predicate.negate();
    }

    public static <T> Predicate<T> predicate(Predicate<T> predicate) {
        return predicate;
    }
}
