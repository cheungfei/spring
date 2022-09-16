package com.spring.study.basic.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-26 15:44
 */
public class SocketClientTest {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("192.168.227.130", 9090);
            OutputStream out = client.getOutputStream();
            InputStream in = System.in;
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            while (true) {
                String line = reader.readLine();
                if (line != null) {
                    byte[] bb = line.getBytes();
                    for (byte b : bb) {
                        out.write(b);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
