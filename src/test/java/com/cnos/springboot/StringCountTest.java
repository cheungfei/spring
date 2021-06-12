package com.cnos.springboot;

//import org.apache.commons.lang3.StringUtils;

//import org.springframework.util.StringUtils;

import java.util.StringTokenizer;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-17 20:16
 */
public class StringCountTest {
    public static void main(String[] args) {
        String testString = "a.b.c.d";

        // 00
//        int count = StringUtils.countMatches("a.b.c.d", ".");
//        System.out.println("count: " + count);

        // 01
//        int spring = StringUtils.countOccurrencesOf(testString, ".");
//        System.out.println("spring = " + spring);
//
//        int replace = testString.length() - testString.replace(".", "").length();
//        System.out.println("replace = " + replace);

        // 替换掉除了.之外的所有字母
//        int replaceAll = testString.replaceAll("[^.]", "").length();
//        System.out.println("replaceAll = " + replaceAll);
//
//        int replaceAllCase2 = testString.length() - testString.replaceAll("\\.", "").length();
//        System.out.println("replaceAll (second case) = " + replaceAllCase2);

//        int split = testString.split("\\.",-1).length - 1;
//        System.out.println("split = " + split);
//
//        long java8 = testString.chars().filter(ch -> ch == '.').count();
//        System.out.println("java8 = " + java8);
//
        long java8Case2 = testString.codePoints().filter(ch -> ch == '.').count();
        System.out.println("java8 (second case) = " + java8Case2);

        String testString1 = "a...b.c....d";
        int stringTokenier = new StringTokenizer(" " + testString1 + " ", ".").countTokens() - 1;
        System.out.println("stringTokenizer = " + stringTokenier);
    }
}
