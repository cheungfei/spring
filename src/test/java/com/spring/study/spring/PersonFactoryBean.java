package com.spring.study.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 22:24
 */
public class PersonFactoryBean implements FactoryBean<Person> {

    /**
     * 直接new出来Person进行返回.
     */
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    /**
     *  指定返回bean的类型.
     */
    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
