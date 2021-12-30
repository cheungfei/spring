package com.fiora.spring.io;

import java.io.RandomAccessFile;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-26 10:38
 */
public class TestRandomAccessFile {
    public static void main(String[] args) {
        String path = "C:\\\\迅雷下载\\out.txt";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "rw");
            randomAccessFile.write("Hello xxxld".getBytes(UTF_8));
            randomAccessFile.seek(6);
            randomAccessFile.write("Wor".getBytes(UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
