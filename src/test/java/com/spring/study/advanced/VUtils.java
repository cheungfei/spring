package com.spring.study.advanced;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/12/14 17:16
 */
public class VUtils {
    /**
     *  如果参数为true抛出异常
     *
     * @param b
     * @return com.example.demo.func.ThrowExceptionFunction
     **/
    public static ThrowExceptionFunction isTure(boolean b) {
        return (errorMessage) -> {
            if (b) {
                throw new RuntimeException(errorMessage);
            }
        };
    }
}
