package com.spring.study.basic.generics;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-17 23:00
 */
public class GenericsTypeFather<T> {
    public GenericsTypeFather() {
        Type genericType = getClass().getGenericSuperclass();
        Type params = ((ParameterizedType) genericType).getActualTypeArguments()[0];
    }
}

class Children extends GenericsTypeFather<Children> {}