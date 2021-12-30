package com.fiora.study.service.impl;

import com.fiora.study.service.MessageService;
import org.springframework.stereotype.Service;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-12-18 8:00
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
