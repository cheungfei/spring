package com.spring.study.grammar.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-31 21:15
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        list = path.list();
        System.out.println(Arrays.toString(list));
        if (args.length == 0) {
            list = path.list();
        } else {
            // .*\.dat
            list = path.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}

class DirFilter implements FilenameFilter {
    private final Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        boolean matches = pattern.matcher(name).matches();
        return matches;
    }
}