package com.fiora.study.stream;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-17 15:33
 */
public interface Defaultable {
    // Interfaces now allow default methods, the implementer may or
    // may not implement (override) them.
    default String notRequired() {
        return "Default implementation";
    }
}


