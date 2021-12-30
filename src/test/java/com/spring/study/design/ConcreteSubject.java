package com.spring.study.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-16 22:54
 */
public class ConcreteSubject implements Subject {
    //储存订阅
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(float temperature, float pressure, float humidity) {
        observerList.forEach(observer -> {
            System.out.print("通知订阅用户 ：");
            observer.update(temperature, pressure, humidity);
        });
    }
}
