package com.spring.study.bean;

import com.spring.study.bean.config.KnightConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 16:00
 */
public class KnightMain {
    public static void main(String[] args) {
        // 从xml类路径加载Spring应用上下文
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "META-INF/spring/knight.xml");

        // 从Java配置中加载应用上下文
        // 对于基于Java的配置，Spring提供了AnnotationConfigApplicationContext。
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
