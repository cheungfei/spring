package com.spring.study.basic;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-02 10:12
 */
public class OperatorTest {
    public static void main(String[] args) {

        int g = 5;
        int x7 = g + (g++ + g) + g;
        System.out.println(x7);
    }
}
