package com.cnos.springboot.generics;

import com.cnos.springboot.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-06 10:35
 */
public class LimitOfInference {
    static void f(Map<User, List<? extends LimitOfInference>> userLimit) {}

    public static void main(String[] args) {
//        f();

//        ArrayList<String>.class;
        Class<ArrayList> arrayListClass = ArrayList.class;
    }
}
