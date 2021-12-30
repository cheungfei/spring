package com.spring.study.concurrent.lock;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-08-12 21:09
 */
/**
 * 保存矩阵中每行找到的指定数字的次数
 */
public class Results {
    private final int[] data;

    /**
     * 构造函数
     */
    public Results(int size) {
        this.data = new int[size];
    }

    public void setData(int position, int value) {
        data[position] = value;
    }

    public int[] getData() {
        return data;
    }
}
