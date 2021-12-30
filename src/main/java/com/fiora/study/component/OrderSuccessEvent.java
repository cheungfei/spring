package com.fiora.study.component;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-30 12:05
 */
public class OrderSuccessEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public OrderSuccessEvent(Object source) {
        super(source);
    }
}
