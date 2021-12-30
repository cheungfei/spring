package com.fiora.study.component;

import com.fiora.study.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-12-18 8:01
 */
@Component
public class MessagePrinter {
    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService messageService) {
        this.service = messageService;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
