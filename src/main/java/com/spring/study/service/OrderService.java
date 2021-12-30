package com.spring.study.service;

import com.spring.study.component.OrderSuccessEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-30 12:04
 */
@Service
public class OrderService {
    @Autowired
    private ApplicationContext applicationContext;

    public void order() {
        // 下单成功
        System.out.println("下单成功...");
        // 发布通知
        applicationContext.publishEvent(new OrderSuccessEvent(this));
        System.out.println("main线程结束...");
    }
}
