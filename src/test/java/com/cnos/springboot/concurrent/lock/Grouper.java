package com.cnos.springboot.concurrent.instance;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-12 21:18
 */
/**
 * 汇总类。
 */
public class Grouper implements Runnable {
    /**
     * 结果集
     */
    private final Results results;

    public Grouper(Results results) {
        this.results = results;
    }

    @Override
    public void run() {
        int finalResult = 0;
        System.out.print("Grouper: Processing results...\n");
        int[] data = results.getData();
        for(int count : data) {
            finalResult += count;
        }
        System.out.printf("Grouper: Total result: %d.\n", finalResult);
    }
}
