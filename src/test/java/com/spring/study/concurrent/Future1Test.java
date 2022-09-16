package com.spring.study.concurrent;

import java.util.concurrent.*;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/12/14 15:47
 */
public class Future1Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {/*
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("原始CompletableFuture方法任务");
            return "捡田螺的小男孩";
        });

        CompletableFuture<String> completableFuture1 = completableFuture.thenApply((a) -> {
            if ("捡田螺的小男孩".equals(a)) {
                return "关注了";
            }

            return "先考虑考虑";
        });

        System.out.println(completableFuture1.get());*/



//        CompletableFuture<String> orgFuture = CompletableFuture.supplyAsync(
//                () -> {
//                    System.out.println("当前线程名称：" + Thread.currentThread().getName());
//                    throw new RuntimeException();
//                }
//        );
//
//        CompletableFuture<String> exceptionFuture = orgFuture.exceptionally((e) -> {
////            e.printStackTrace();
////            return "你的程序异常啦";
//            throw new RuntimeException();
//        });
//
//        System.out.println("异常后获取信息：" + exceptionFuture.get());


//        CompletableFuture<String> first = CompletableFuture.completedFuture("第一个异步任务");
//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        //第二个异步任务
//        // (w, s) -> System.out.println(s) 是第三个任务
//        CompletableFuture<String> future = CompletableFuture
//                .supplyAsync(() -> "第二个异步任务", executor)
//                .thenCombineAsync(first, (s, w) -> {
//                    System.out.println(w);
//                    System.out.println(s);
//                    return "两个异步任务的组合";
//                }, executor);
//        System.out.println(future.join());
//        executor.shutdown();


//        CompletableFuture<String> f = CompletableFuture.completedFuture("第一个任务");
//        //第二个异步任务
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        CompletableFuture<String> future = CompletableFuture
//                .supplyAsync(() -> "第二ssss个任务", executor)
//                .thenComposeAsync(data -> {
//                    System.out.println(data);
//                    //使用第一个任务作为返回
////                    return f;
//                    return null;
//                }, executor);
//
////        System.out.println(future.join());
//        executor.shutdown();


//        ExecutorService executorService = new ThreadPoolExecutor(5, 10, 5L,
//                TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            int a = 0;
//            int b = 666;
////            int c = b / a;
//            return true;
//        },executorService).thenAccept(System.out::println);
//
//        //如果不加 get()方法这一行，看不到异常信息
//
//        //如果不加 get()方法这一行，看不到异常信息
//        System.out.println(future.get());


        CompletableFuture<String> orgFuture = CompletableFuture.supplyAsync(
                ()->{
                    System.out.println("原始CompletableFuture方法任务");
                    return "捡田螺的小男孩";
                }
        );

        CompletableFuture<String> thenAcceptFuture = orgFuture.thenApply((a) -> {
            if ("捡田螺的小男孩".equals(a)) {
                System.out.println("关注了");
            }

            System.out.println("先考虑考虑");

            return "黑恶黑";
        });

        System.out.println("嘿嘿嘿：" + thenAcceptFuture.get());

    }
}
