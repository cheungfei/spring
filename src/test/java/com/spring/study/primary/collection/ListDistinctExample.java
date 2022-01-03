package com.spring.study.primary.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 介绍了 6 种集合去重的方法，其中实现最简洁，
 * 且去重之后的顺序能和原集合保持一致的实现方法，只有两种：LinkedHashSet 去重和 Stream 去重，
 * 而后一种去重方法无需借助新集合，是我们优先考虑的去重方法
 */
public class ListDistinctExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(5);
            add(2);
            add(1);
            add(3);
            add(7);
            add(2);
        }};
        System.out.println("原集合:" + list);
        method(list);
    }

    /**
     * 自定义去重
     * @param list 待去重集合
     */
    public static void method(List<Integer> list) {
        // 新集合
        List<Integer> newList = new ArrayList<>(list.size());
        list.forEach(i -> {
            if (!newList.contains(i)) { // 如果新集合中不存在则插入
                newList.add(i);
            }
        });
        System.out.println("去重集合:" + newList);
    }

    /**
     * 使用迭代器去重
     * @param list 待去重集合
     */
    public static void method_1(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            // 获取循环的值
            Integer item = iterator.next();
            // 如果存在两个相同的值
            if (list.indexOf(item) != list.lastIndexOf(item)) {
                // 移除最后那个相同的值
                iterator.remove();
            }
        }
        System.out.println("去重集合:" + list);
    }

    /**
     * 使用 HashSet 去重
     * @param list 待去重集合
     */
    public static void method_2(List<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("去重集合:" + set);
    }

    /**
     * 使用 LinkedHashSet 去重
     * @param list 待去重集合
     */
    public static void method_3(List<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        System.out.println("去重集合:" + set);
    }

    /**
     * 使用 TreeSet 去重(无序)
     * @param list 待去重集合
     */
    public static void method_4(List<Integer> list) {
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println("去重集合:" + set);
    }

    /**
     * 使用 Stream 去重
     * @param list 待去重集合
     */
    public static void method_5(List<Integer> list) {
        list = list.stream().distinct().collect(Collectors.toList());
        System.out.println("去重集合:" + list);
    }
}
