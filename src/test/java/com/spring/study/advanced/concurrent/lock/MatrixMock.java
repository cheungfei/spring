package com.spring.study.advanced.concurrent.lock;

import java.util.Random;

/**
 * 此矩阵类负责随机生成一个在1~10之间的数字矩阵.
 */
public class MatrixMock {
    private final int[][] data;

    /**
     * 构造函数
     * @param row    行数
     * @param col    列数
     * @param number    查找的数字
     */
    public MatrixMock(int row, int col, int number) {

        int counter = 0;
        this.data = new int[row][col];
        Random random = new Random();

        //用随机数字填充矩阵
        for(int i = 0; i < row; i ++) {
            for(int j = 0; j < col; j++) {
                data[i][j] = random.nextInt(10);
                if(data[i][j] == number) {
                    counter++;
                }
            }
        }

        //将在矩阵中查找到的次数打印到控制台
        System.out.printf("Mock: There are %d occurrences of %d in " +
                "generated data.\n", counter, number);
    }

    /**
     * 返回矩阵某行的数据
     * @param row    行号
     * @return    如果该行存在, 返回该行的数据; 否则返回nul
     */
    public int[] getRow(int row) {
        if((row >= 0) && (row < data.length)) {
            return data[row];
        }

        return null;
    }
}
