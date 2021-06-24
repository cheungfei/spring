package com.cnos.springboot.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-23 6:33
 */
public class InputStreamToOutputStream {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(
//                new FileInputStream(new File("C:\\Users\\zhangfei\\Documents\\gui-config.json"))));
//        reader.lines().forEachOrdered(System.out::println);

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\zhangfei\\Documents\\gui-config.json"));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int result = inputStream.read(); result != -1; result = inputStream.read()) {
            byteArrayOutputStream.write((byte)result);
        }
        System.out.println("Byte Data: " + byteArrayOutputStream.toString(StandardCharsets.UTF_8.toString()));

    }
}
