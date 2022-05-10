package com.spring.study.advanced.concurrent;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-05-10 21:07
 */
public class FancyBlockSyncTest {
    public synchronized void method1() {
        synchronized (this) {
            // 逻辑代码
        }
    }
}
