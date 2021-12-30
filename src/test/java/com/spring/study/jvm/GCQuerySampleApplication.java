package com.spring.study.jvm;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class GCQuerySampleApplication {
    public static void main(String[] args) {
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    // 不干活，专门生成1mb的小对象
                    byte[] temp = new byte[1024 * 1024];
                    // 随机睡眠1秒以内
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start(), 100, 100, TimeUnit.MILLISECONDS);
    }
}
