package com.spring.study.advanced;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/12/14 17:15
 */
@FunctionalInterface
public interface ThrowExceptionFunction {
    /**
     * 抛出异常信息
     *
     * @param message 异常信息
     * @return void
     **/
    void throwMessage(String message);
}
