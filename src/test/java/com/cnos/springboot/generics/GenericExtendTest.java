package com.cnos.springboot.generics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-20 17:54
 */
public class GenericExtendTest {
    static class Food {}
    static class Fruit extends Food {}
    static class Apple extends Fruit {}
    static class Orange extends Fruit {}

    public static void main(String[] args) throws IOException {
/*        List<? extends Fruit> fruits = new ArrayList<>();
        //不能加入任何元素
//        fruits.add(new Food());     // compile error
//        fruits.add(new Fruit());    // compile error
//        fruits.add(new Apple());    // compile error

        //集合元素的类型，符合extends Fruit，可赋值给变量fruits
        fruits = new ArrayList<Food>(); // compile error
        fruits = new ArrayList<Fruit>(); // compile success
        fruits = new ArrayList<Apple>(); // compile success  注1
        fruits.add(new Apple());   // compile error 注2

        //
        fruits = new ArrayList<Apple>();
        fruits.add(new Orange());

        // Wildcard type '? extends com.cnos.springboot.generics.GenericExtendTest.Fruit'
        // cannot be instantiated directly
//        fruits = new ArrayList<? extends Fruit>(); // 在java中会出现 compile error: 通配符类型无法实例化

        Fruit object = fruits.get(0);    // compile success*/
    }

    public  static  void playFruitBase(List < ? super  Fruit> list){
        Object obj = list.get(0);
//        Fruit fruit = list.get(0);
    }
}
