package com.cnos.springboot.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);


//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }
//        Iterator<Integer> iterator = list.iterator();
//        long start = System.currentTimeMillis();
//        while(iterator.hasNext()){
//            Integer num = iterator.next();
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


//        List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < list.size(); i++) {
//            Integer num = list.get(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);


//        List<Integer> list = new LinkedList<>();
//        for (int i = 0; i < 100000; i++) {
//            list.add(i);
//        }
//        Iterator<Integer> iterator = list.iterator();
//        long start = System.currentTimeMillis();
//        while(iterator.hasNext()){
//            Integer num = iterator.next();
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
    }
}
