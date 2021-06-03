package com.cnos.springboot.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-05-31 20:12
 */
public class WriteAFile {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("demo.txt")) {
            fileWriter.write("hello foo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
