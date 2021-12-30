package com.cnos.springboot.nio;

import java.nio.ByteBuffer;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-26 8:17
 */
public class TestByteBuffer {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
        System.out.println("position: " + buffer.position());
        System.out.println(".limit: " + buffer.limit());
        System.out.println("capacity: " + buffer.capacity());
        System.out.println("mark: " + buffer);

        buffer.put("123".getBytes());
        System.out.println("-------------put:123......");
        System.out.println("mark: " + buffer);

        buffer.flip();
        System.out.println("-------------flip......");
        System.out.println("mark: " + buffer);

        buffer.get();
        System.out.println("-------------get......");
        System.out.println("mark: " + buffer);

        buffer.compact();
        System.out.println("-------------compact......");
        System.out.println("mark: " + buffer);

        buffer.clear();
        System.out.println("-------------clear......");
        System.out.println("mark: " + buffer);
    }
}
