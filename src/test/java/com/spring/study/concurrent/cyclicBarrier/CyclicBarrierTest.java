package com.spring.study.concurrent.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-12 19:28
 */
public class CyclicBarrierTest {
    static CyclicBarrier c = new CyclicBarrier(2);

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                System.out.println(0.0);
                c.await();
            } catch (Exception ignored) {
            }
            System.out.println(1);
        }).start();

        try {
//            Thread.sleep(1);
            System.out.println(0.1);
            c.await();
        } catch (Exception ignored) {
        }

        System.out.println(2);
    }
}
