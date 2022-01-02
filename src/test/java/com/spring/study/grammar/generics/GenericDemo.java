package com.spring.study.grammar.generics;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-20 22:00
 */
public class GenericDemo<T> {  // 在类名后声明引入泛型类型
    private T field;  // 引入后可以将字段声明为泛型类型

    public T getField() { // 类方法内也可以使用泛型类型
        return field;
    }

    public static void main(String[] args) {
//        List<? extends GenericDemo<String>> genericsList = new ArrayList<>();
//        GenericDemo<String> generics = genericsList.get(0);
//        genericsList.add(new GenericDemo<String>()); // 编译无法通过

//        List<? extends Generics> genericsList = new ArrayList<>();
//        Generics generics = genericsList.get(0);
//        genericsList.add(new Generics<String>()); // 编译无法通过

//        List<? super Generics> genericsList = new ArrayList<>();
//        genericsList.add(new Generics()); // 编译无法通过
//        Generics generics = genericsList.get(0);
    }
}
