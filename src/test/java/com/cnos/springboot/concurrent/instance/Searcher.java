package com.cnos.springboot.concurrent.instance;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 查找类。每个查找类单独分配一个线程，是一个子任务。
 */
public class Searcher implements Runnable {
    //查找的起始行号
    private int firstRow;
    //查找的终止行号
    private int lastRow;
    //查找的矩阵
    private MatrixMock matrixMock;
    //结果集合
    private Results results;
    //待查找的数字
    private int number;

    private final CyclicBarrier barrier;

    /**
     * 构造函数
     * @param firstRow      起始行号
     * @param lastRow       结束行号
     * @param matrixMock    矩阵
     * @param results       结果集
     * @param number        查找的数字
     * @param barrier       栅栏
     */
    public Searcher(int firstRow, int lastRow, MatrixMock matrixMock,
                    Results results, int number, CyclicBarrier barrier) {

        this.firstRow = firstRow;
        this.lastRow = lastRow;
        this.matrixMock = matrixMock;
        this.results = results;
        this.number = number;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        int counter;

        System.out.printf("%s: Processing lines " + "from %d to %d.\n", Thread.currentThread().getName(), firstRow, lastRow);

        for (int i = firstRow; i < lastRow; i++) {
            counter = 0;
            int[] row = matrixMock.getRow(i);   //第i行
            for (int j = 0; j < row.length; j++) {
                if (row[j] == number) {
                    counter++;
                }
            }
            results.setData(i, counter);
        }

        System.out.printf("%s: Lines processed.\n", Thread.currentThread().getName());

        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
