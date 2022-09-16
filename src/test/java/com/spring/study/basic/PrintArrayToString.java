package com.spring.study.basic;

import java.util.Arrays;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-25 20:01
 */
public class PrintArrayToString {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

//      JAVA对于点号"."的处理, 用split举例,需要转义：str.split("\\.")

        int[] arrayA = new int[]{10, 20, 30};   //静态数组标准分配
        char[] arrayB = new char[]{'大', '来', '嘞'};

        long[] arrayC = new long[]{1L, 2L, 3L};
    }
}
