package com.spring.study.grammar.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-02 20:37
 */
public class UsingRandomAccessFile {
    static String file = "rtest.dat";

    public static void main(String[] args) throws IOException {
        File file1;
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        for (int i = 0; i < 7; i++) {
            rf.writeDouble(i * 1.1414);
        }
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5 * 8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }

    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for (int i = 0; i < 7; i++) {
            System.out.println("Value " + i + ": " + rf.readDouble());
        }
        rf.close();
    }
}
