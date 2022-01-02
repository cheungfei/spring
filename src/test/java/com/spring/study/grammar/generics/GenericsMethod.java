package com.spring.study.grammar.generics;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-06 10:06
 */
public class GenericsMethod {
    public <T> void f(T x) {
//        System.out.println(x.getClass().getName());
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericsMethod gm = new GenericsMethod();
        gm.<String>f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}