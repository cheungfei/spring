package com.spring.study.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 22:32
 *
 * https://mp.weixin.qq.com/s/f1JMiNdZrrZvZra6fLiUMA
 */
public class Demo2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

//        applicationContext.refresh();
//        Person bean0 = applicationContext.getBean(Person.class);
//        System.out.println(bean0);

        //下述代码中，我们手动向beanDefinitionRegistry中注册了person的BeanDefinition。最终成功将person加入到applicationContext中
        MyBeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor = new MyBeanDefinitionRegistryPostProcessor();
        applicationContext.addBeanFactoryPostProcessor(beanDefinitionRegistryPostProcessor);
        applicationContext.refresh();

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }
}
