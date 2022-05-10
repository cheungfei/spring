package com.spring.study.advanced.concurrent;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-10 19:59
 */
public class FancySyncTest {
    public synchronized void method1() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final FancySyncTest fs1 = new FancySyncTest();
        final FancySyncTest fs2 = new FancySyncTest();

        Thread t1 = new Thread(fs1::method1,"线程1获取到资源");
        Thread t2 = new Thread(fs2::method1,"线程2获取到资源");

        t1.start();
        t2.start();
    }
}
