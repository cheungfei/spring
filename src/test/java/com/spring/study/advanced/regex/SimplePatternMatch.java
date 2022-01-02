package com.spring.study.advanced.regex;

import java.util.regex.Pattern;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-23 21:09
 */
public class SimplePatternMatch {
    public static void main(String[] args) {
        String[] filenames = new String[]{".git", "HELP.md", "pom.xml", "README.md", "rtest.dat",
                "springboot.iml", "src", "target"};

        // .*\\.md
//        boolean matches = Pattern.matches(".*\\.md", "README.md");
//        System.out.println(matches);

        System.out.println(Pattern.matches(".*\\.md", "HELP.md"));
    }
}
