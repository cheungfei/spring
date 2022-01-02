package com.spring.study.primary.collection;


import com.google.common.collect.Lists;
import org.apache.commons.collections4.ListUtils;

import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-13 12:06
 */
public class SplitList {
    public static void main(String[] args) {
        List<String> samples = Lists.newArrayList("1", "2", "3", "4",
                "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17");
        List<List<String>> partition = ListUtils.partition(samples, 30);

        partition.forEach(System.out::println);
    }
}
