package com.fiora.study.io;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-26 11:17
 */
public class TestRandomAccessFileIO {
    public static void main(String[] args) throws Exception {
        testRandomAccessFileIO();
    }

    public static void testRandomAccessFileIO() throws Exception {
        String path = "C:\\迅雷下载\\out1.txt";
        byte[] data = "1234567\n".getBytes();
        RandomAccessFile file = new RandomAccessFile(path, "rw");
        FileChannel channel = file.getChannel();
        int size = 4096 * 100; // 1024 * 4 = 4096B = 4k
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, size);
        while (size != 0) {
            map.put(data);
            size -= data.length;
        }
        map.force();
    }
}
