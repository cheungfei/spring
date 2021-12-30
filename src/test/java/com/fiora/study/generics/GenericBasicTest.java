package com.fiora.study.generics;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-17 23:20
 */
public class GenericBasicTest {
    public static void error(){
        Object[] nums = new Integer[3];
        nums[0] = 3.2;
        nums[1] = "string"; //运行时报错，nums运行时类型是Integer[]
        nums[2] = '2';
    }
}
