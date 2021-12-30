package com.cnos.springboot.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-25 20:39
 */
public class OSFileIO {
    static byte[] data = "123456789\n".getBytes();
    static String path = "/data/io/out.txt";

    public static void main(String[] args) throws Exception {
        switch (args[0]) {
            case "0":
                testBasicFileIO();
                break;
            case "1":
                testBufferedFileIO();
                break;
            default:
                break;
        }
    }

    public static void testBasicFileIO() throws Exception {
        File file = new File(path);
        FileOutputStream out = new FileOutputStream(file);
        while (true) {
            out.write(data);
        }
    }

    public static void testBufferedFileIO() throws Exception {
        File file = new File(path);
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
        while (true) {
            out.write(data);
        }
    }
}
