package com.spring.study.primary.generics;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-21 6:33
 */
public class GenericEraseTest {
    static <T> T[] toArray(T... args) {

        return args;
    }

    static String[] toStringArray(String... args) {

        return args;
    }

    static <T> T[] pickTwo(T a, T b, T c) {
//        toStringArray(a, b);

        switch(ThreadLocalRandom.current().nextInt(3)) {
            case 0: return toArray(a, b);
            case 1: return toArray(a, c);
            case 2: return toArray(b, c);
        }
        throw new AssertionError(); // Can't get here
    }

    public static void main(String[] args) {

//        pickTwo("Good", "Fast", "Cheap");
        String[] attributes = pickTwo("Good", "Fast", "Cheap");
    }
}
