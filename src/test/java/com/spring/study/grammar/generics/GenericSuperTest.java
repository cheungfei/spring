package com.spring.study.grammar.generics;

import java.io.IOException;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-20 17:52
 */
public class GenericSuperTest {
    static class Food {}
    static class Fruit extends Food {}
    static class Apple extends Fruit {}

    public static void main(String[] args) throws IOException {
/*        List<? super Fruit> fruits = new ArrayList<>();
        //Fruit及其子类，可被看做是Fruit，从而添加成功
        fruits.add(new Object());
        fruits.add(new Food());     // compile error
        fruits.add(new Fruit());    // compile success
        fruits.add(new Apple());    // compile success

        //集合元素的类型，符合super Fruit，可赋值给变量fruits，赋值后fruits不再是逆变类型
        fruits = new ArrayList<Food>(); // compile success
        fruits = new ArrayList<Fruit>(); // compile success
        fruits = new ArrayList<Apple>(); // compile error

        // Wildcard type '? super com.cnos.springboot.generics.GenericSuperTest.Fruit'
        // cannot be instantiated directly
        fruits = new ArrayList<? super Fruit>(); // compile error: 通配符类型无法实例化

        Fruit object = fruits.get(0); // compile error*/
    }
}
