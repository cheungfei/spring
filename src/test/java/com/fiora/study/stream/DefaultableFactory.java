package com.fiora.study.stream;

import java.util.function.Supplier;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-17 15:33
 */
public interface DefaultableFactory {
    // Interfaces now allow static methods
    static Defaultable create(Supplier<Defaultable> supplier ) {
        return supplier.get();
    }
}
