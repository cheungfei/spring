package com.spring.study.advanced.concurrent;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-10 20:14
 */
public class FancyStaticSyncTest {
    public static synchronized void method1() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void commonMethod() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(FancyStaticSyncTest::method1,"线程1获取到资源");
        Thread t2 = new Thread(FancyStaticSyncTest::method1,"线程2获取到资源");

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        FancyStaticSyncTest test = new FancyStaticSyncTest();
        test.commonMethod();
    }
}
