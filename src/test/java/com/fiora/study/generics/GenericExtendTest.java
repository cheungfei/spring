package com.fiora.study.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-20 17:54
 */
public class GenericExtendTest {
    interface Eatable {}
    interface Palatable {}
    static class Food {}
    static class Fruit extends Food implements Eatable, Palatable {}
    static class Apple extends Fruit {}
    static class Orange extends Fruit {}

/*    public static void main(String[] args) throws IOException {
        List<? extends Fruit> fruits = new ArrayList<>();
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

        Fruit object = fruits.get(0);    // compile success
    }*/

//    public  static  void playFruitBase(List < ? super  Fruit> list){
//        Object obj = list.get(0);
////        Fruit fruit = list.get(0);
//    }


    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        List<Orange> oranges = new ArrayList<>();
        List<Fruit> fruits = new ArrayList<>();
        List<Food> foods = new ArrayList<>();
        List<Eatable> eatableList  = new ArrayList<>();
        List<Palatable> palatableList  = new ArrayList<>();

        // extend
        playFruitExtend(apples);
        playFruitExtend(oranges);
        playFruitExtend(fruits);
//        playFruitExtend(foods);  // 编译错误


        // super
//        playFruitSuper(apples);  // 编译错误
//        playFruitSuper(oranges);  // 编译错误
        playFruitSuper(fruits);
        playFruitSuper(foods);
        playFruitSuper(eatableList);
        playFruitSuper(palatableList);
    }

    public static  void playFruitExtend(List < ? extends Fruit> list) {
//        list.add(new Apple());  // 编译错误
//        list.add(new Orange()); // 编译错误
//        list.add(new Fruit()); // 编译错误
        list.add(null);
    }

    public  static  void playFruitSuper(List < ? super  Fruit> list) {
        list.add(new Apple());
        list.add(new Fruit());
//        list.add(new Food());  // 编译错误

//        Eatable eatable = new Fruit();
//        list.add(eatable);

//        Palatable palatable = new Fruit();
//        list.add(palatable);
    }

}
