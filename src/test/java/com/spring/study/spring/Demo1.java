package com.spring.study.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 22:09
 */
//@Import(Person.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
//@Import(MyDeferredImportSelector.class)

@Configuration
public class Demo1 {
    @Bean
    public PersonFactoryBean personFactoryBean() {
        return new PersonFactoryBean();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Demo1.class);

        Person bean = configApplicationContext.getBean(Person.class);

        System.out.println(bean);
    }
}
