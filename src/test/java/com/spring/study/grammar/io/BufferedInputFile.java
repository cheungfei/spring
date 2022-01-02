package com.spring.study.grammar.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-02 7:24
 */
public class BufferedInputFile {
    public static void main(String[] args) throws IOException {
        System.out.println(readFile("demo.txt"));
    }

    public static String readFile(String fileName) throws IOException {
        String s;
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
        while ((s = bufferedReader.readLine()) != null) {
            stringBuilder.append(s).append("\n");
        }
        return stringBuilder.toString();
    }
}
