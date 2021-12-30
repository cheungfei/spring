package com.cnos.springboot.concurrent.countdownLatch;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-12 20:43
 */
public class JoinCountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        Thread parser1 = new Thread(() -> {});
        Thread parser2 = new Thread(() -> System.out.println("parser2 finish"));
        parser1.start();
        parser2.start();
        parser1.join();
        parser2.join();
        System.out.println("all parser finish");
    }
}
