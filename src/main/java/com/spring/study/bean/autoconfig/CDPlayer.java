package com.spring.study.bean.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 17:09
 *
 * @Inject注解来源于Java依赖注入规范，该规范同时还为我们定义了@Named注解。在自动
 * 装配中，Spring同时支持@Inject和@Autowired。尽管@Inject和@Autowired之间有着
 * 一些细微的差别，但是在大多数场景下，它们都是可以互相替换的。
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }


    /**
     * 在Spring初始化bean之后，它会尽可能得去满足bean的依赖，在本例中，依赖是通过带
     * 有@Autowired注解的方法进行声明的，也就是setCompactDisc()。
     * 实际上，Setter方法并没有什么特殊之处。@Autowired注解可以用在类的任何方法上。假
     * 设CDPlayer类有一个insertDisc()方法，那么@Autowired能够像
     * 在setCompactDisc()上那样，发挥完全相同的作用
      */
//    @Autowired
//    public void setCompactDisc(CompactDisc cd) {
//        this.cd = cd;
//    }

//    @Autowired
//    public void insertDisc(CompactDisc cd) {
//        this.cd = cd;
//    }
}
