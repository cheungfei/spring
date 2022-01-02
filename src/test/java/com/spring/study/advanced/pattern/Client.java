package com.spring.study.advanced.pattern;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-16 22:59
 */
public class Client {
    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver("1");
        ConcreteObserver concreteObserver2 = new ConcreteObserver("2");
        concreteSubject.registerObserver(concreteObserver);
        concreteSubject.registerObserver(concreteObserver2);
        //通知用户
        concreteSubject.notifyObserver(1,1,1);
    }
}
