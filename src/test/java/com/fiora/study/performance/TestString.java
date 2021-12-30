package com.fiora.study.performance;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-12-17 19:47
 */
public class TestString {
    private static final int max = 900000;

    public void testPlus() {
        System.out.println(">>> testPlus() <<<");

        String str = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            str = str + "a";
        }

        long end = System.currentTimeMillis();

        long cost = end - start;

        System.out.println("   {str + \"a\"} cost=" + cost + " ms");
    }

    public void testConcat() {
        System.out.println(">>> testConcat() <<<");

        String str = "";

        long start = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            str = str.concat("a");
        }

        long end = System.currentTimeMillis();

        long cost = end - start;

        System.out.println("   {str.concat(\"a\")} cost=" + cost + " ms");
    }

    public void testJoin() {
        System.out.println(">>> testJoin() <<<");

        long start = System.currentTimeMillis();

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < max; i++) {
            list.add("a");
        }

        long end1 = System.currentTimeMillis();
        long cost1 = end1 - start;

        StringUtils.join(list, "");

        long end = System.currentTimeMillis();
        long cost = end - end1;

        System.out.println("   {list.add(\"a\")} cost1=" + cost1 + " ms");
        System.out.println("   {StringUtils.join(list, \"\")} cost=" + cost
                + " ms");
    }

    public void testStringBuffer() {
        System.out.println(">>> testStringBuffer() <<<");

        long start = System.currentTimeMillis();

        StringBuffer strBuffer = new StringBuffer();

        for (int i = 0; i < max; i++) {
            strBuffer.append("a");
        }
        strBuffer.toString();

        long end = System.currentTimeMillis();

        long cost = end - start;

        System.out.println("   {strBuffer.append(\"a\")} cost=" + cost + " ms");
    }

    public void testStringBuilder() {
        System.out.println(">>> testStringBuilder() <<<");

        long start = System.currentTimeMillis();

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < max; i++) {
            strBuilder.append("a");
        }
        strBuilder.toString();

        long end = System.currentTimeMillis();

        long cost = end - start;


        System.out
                .println("   {strBuilder.append(\"a\")} cost=" + cost + " ms");
    }
}
