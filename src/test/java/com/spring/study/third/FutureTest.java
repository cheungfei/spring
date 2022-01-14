package com.spring.study.third;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/12/14 11:16
 */
public class FutureTest {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger i = new AtomicInteger();

        ExecutorService executorService = Executors.newCachedThreadPool();
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("开始执行异步任务，提供返回值");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "返回值";
        }, executorService);
        String join = completableFuture.join();
        System.out.println(join);

        System.out.println("0当前线程: " + Thread.currentThread().getThreadGroup());

        CompletableFuture<Void> hahhha = CompletableFuture.runAsync(() ->
                {
                    System.out.println("1当前线程: " + Thread.currentThread().getThreadGroup());
                    System.out.println("hahhha");

                }, executorService);

        hahhha.thenRun(() -> {
            System.out.println("2当前线程: " + Thread.currentThread().getThreadGroup());
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("2eeeeeeee");

            i.getAndIncrement();
        });

//        while (!hahhha.isDone()) {
//            System.out.println("3不带返回值任务未完成");
//            Thread.sleep(1000);
//        }

        executorService.shutdown();

        Thread.sleep(50000);

        System.out.println(i.get());

    }
}
