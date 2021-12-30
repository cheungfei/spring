package com.spring.study.regex;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-23 20:15
 */
public class FilterFilenameWithRegex {
    public static void main(String[] args) {
        File file = new File(".");
        String[] filenames = file.list();
        System.out.println(Arrays.toString(filenames));

        // .*\\.md
        System.out.println("--------------------------------");

        List<String> matchResult = new ArrayList<>();
        Pattern pattern = Pattern.compile(".*mo.*");
//        Pattern pattern = Pattern.compile(".*\\.md");
        for (String filename : filenames) {
            boolean matcher = pattern.matcher(filename).matches();
            if (matcher) {
                matchResult.add(filename);
            }
        }

        System.out.println("matched files: " + matchResult);
    }

}
