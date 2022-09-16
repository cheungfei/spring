package com.spring.study.basic.generics;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-26 6:15
 */
public class GenericsDemo02 {
    public static void main(String[] args) {
        pickTwo("Good", "Fast", "Cheap");
        String[] attributes = pickTwo("Good", "Fast", "Cheap");
    }


    static <T> T[] toArray(T... args) {

        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError(); // Can't get here
    }
}
