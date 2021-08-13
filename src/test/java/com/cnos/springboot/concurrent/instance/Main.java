package com.cnos.springboot.concurrent.instance;

import java.util.concurrent.CyclicBarrier;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-12 21:20
 */
public class Main {
    public static void main(String[] args) {

        final int ROW = 10000;  //行
        final int COL = 1000;   //列
        final int TARGET_NUMBER = 5;    //需要搜索的数字
        final int PARTICIPANTS = 5;     //子任务的个数
        final int LINES_PARTICIPANT = 2000;

        //创建矩阵
        MatrixMock matrixMock = new MatrixMock(ROW, COL, TARGET_NUMBER);
        //创建结果集
        Results results = new Results(ROW);
        Grouper grouper = new Grouper(results);
        CyclicBarrier barrier = new CyclicBarrier(PARTICIPANTS, grouper);
        //创建查找类
        Searcher[] searchers = new Searcher[PARTICIPANTS];
        for(int i = 0; i < PARTICIPANTS; i++) {
            searchers[i] = new Searcher(i * LINES_PARTICIPANT, i * LINES_PARTICIPANT + LINES_PARTICIPANT,
                    matrixMock, results, TARGET_NUMBER, barrier);
            Thread thread = new Thread(searchers[i]);
            thread.start();
        }

        System.out.print("Main: The main thread has finished.\n");
    }
}
