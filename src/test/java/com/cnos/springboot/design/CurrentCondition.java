package com.cnos.springboot.design;

import lombok.Data;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-16 22:58
 */
@Data
public class CurrentCondition {
    private float temperature;
    private float pressure;
    private float humidity;

    public CurrentCondition(String name,float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display(name);
    }

    private void display(String name) {
        System.out.println("用户"+name);
        System.out.println("Today :: 温度 :" + temperature);
        System.out.println("Today :: 湿度 :" + humidity);
        System.out.println("Today :: 气温 :" + pressure);
    }
}
