package com.spring.study.spring;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 22:09
 */
public class Person {
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
