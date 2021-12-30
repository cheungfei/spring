package com.fiora.study.design;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-16 22:57
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        CurrentCondition currentCondition = new CurrentCondition(name,temperature,pressure,humidity);
    }
}
