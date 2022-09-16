package com.spring.study.basic;

import java.util.StringJoiner;
import java.util.stream.IntStream;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-17 20:04
 */
public class StringJoinerTest {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder sb = new StringBuilder();
        IntStream.range(1, 10).forEach(i -> {
            sb.append(i + "");
            if (i < 10) {
                sb.append(",");
            }
        });
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());

        // StringJoiner
        StringJoiner sj = new StringJoiner(",");
        IntStream.range(1, 10).forEach(i -> sj.add(i + ""));
        System.out.println(sj.toString());
    }
}
