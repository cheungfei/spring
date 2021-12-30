package com.fiora.study.design;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-16 22:57
 */
public interface Observer {
    /**
     * 更新
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void update(float temperature,float pressure,float humidity);
}
