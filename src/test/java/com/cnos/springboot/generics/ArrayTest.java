package com.cnos.springboot.generics;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-21 6:05
 */
public class ArrayTest {
    public static void main(String[] args) {
        error();
    }

    public static void error() {
        Object[] nums = new Integer[3];
        nums[0] = 3.2;
        nums[1] = "string"; //运行时报错，nums运行时类型是Integer[]
        nums[2] = '2';
    }
}
