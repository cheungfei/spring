package com.spring.study.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-27 22:46
 */
public class GenericsDemo04 {
    public static void main(String[] args) {
//        List<String>[] ls = new ArrayList<String>[10];

//        List<?>[] ls = new ArrayList<?>[10];

//        List<String>[] lsls = new ArrayList[10];

//        List<String>[] lsa = new List<String>[10]; // Not really allowed.
//        Object o = lsa;
//        Object[] oa = (Object[]) o;
//        List<Integer> li = new ArrayList<Integer>();
//        li.add(new Integer(3));
//        oa[1] = li; // Unsound, but passes run time store check
//        String s = lsa[1].get(0); // Run-time error: ClassCastException.

        List<?>[] lsa = new List<?>[10]; // OK, array of unbounded wildcard type.
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        oa[1] = li; // Correct.
        Integer i = (Integer) lsa[1].get(0); // OK
    }

    // Unchecked warning.
    <T> T badCast(T t, Object o) {
        return (T) o;
    }

}
