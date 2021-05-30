package com.cnos.springboot.generics;

import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-25 20:02
 */
public class GenericsDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List rawList = new ArrayList();

        addRawList(list);
        addRawList(rawList);

        addGenericList(list);
        addGenericList(rawList);
    }

    public static void addRawList(List list) {
        list.add("123");
        list.add(2);
    }

    public static void addGenericList(List<String> list) {
        list.add("1"); // Only String
        list.add("2");
    }

    public static void error() {
        Object[] nums = new Integer[3];
        nums[0] = 3.2;
        nums[1] = "string";  // 运行时报错，nums运行时类型是Integer[]
        nums[2] = '2';
    }

}
