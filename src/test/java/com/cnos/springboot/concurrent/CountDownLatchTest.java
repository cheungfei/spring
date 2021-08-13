package com.cnos.springboot.concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-12 20:46
 */
public class CountDownLatchTest {
    static CountDownLatch c = new CountDownLatch(2);
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            System.out.println(1);
            c.countDown();
            System.out.println(2);
            c.countDown();
        }).start();
        c.await();
        System.out.println("3");
    }
}
