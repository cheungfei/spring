package com.cnos.springboot.concurrent.cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-12 19:32
 */
public class CyclicBarrierTest2 {
    static CyclicBarrier c = new CyclicBarrier(2, new A());

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                c.await();
            } catch (Exception ignored) {
            }
            System.out.println(1);
        }).start();

        try {
            c.await();
        } catch (Exception ignored) {
        }

        System.out.println(2);
    }

    static class A implements Runnable {
        @Override
        public void run() {
            System.out.println(3);
        }
    }
}
