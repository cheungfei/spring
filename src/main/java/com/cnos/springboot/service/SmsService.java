package com.cnos.springboot.service;

import com.cnos.springboot.component.OrderSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-30 12:06
 */
@Service
public class SmsService implements ApplicationListener<OrderSuccessEvent> {
    @Override
    public void onApplicationEvent(OrderSuccessEvent event) {
        this.sendSms();
    }

    /**
     * 发送短信
     */
    public void sendSms() {
        System.out.println("发送短信...");
    }
}
