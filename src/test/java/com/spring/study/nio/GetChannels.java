package com.spring.study.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-03 20:43
 */
public class GetChannels {
    private static final Integer BATCH_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        // Write a file
        FileChannel fc = new FileOutputStream("demo.dat").getChannel();
        fc.write(ByteBuffer.wrap("write some data  ".getBytes()));
        fc.close();
        // Add to the end of the file
        fc = new RandomAccessFile("demo.dat", "rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();
        // Read the file
        fc = new FileInputStream("demo.dat").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BATCH_SIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining()) {
            System.out.print((char) buff.get());
        }
    }
}
