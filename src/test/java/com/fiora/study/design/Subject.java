package com.fiora.study.design;


/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-16 22:54
 */
public interface Subject {
    /**
     * 注册观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObserver(float temperature, float pressure, float humidity);
}
