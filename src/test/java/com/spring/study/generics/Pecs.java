package com.spring.study.generics;

import java.util.ArrayList;

interface Common {}

class Food implements Common {}

class Fruit extends Food {}

class Apple extends Fruit {}


public class Pecs {

    public static void main(String[] args) {
        ArrayList<? extends Fruit> extendFruit = new ArrayList<>();
        ArrayList<? super Fruit> superFruit = new ArrayList<>();
        Apple apple = new Apple();

        Fruit a1 = extendFruit.get(0);
//        Fruit a2 = superFruit.get(0); // Required type: Provided: capture of ? super Fruit

//        extendFruit.add(apple); // Err2  Required type: capture of ? extends Fruit
        superFruit.add((Fruit) apple);
//        superFruit.add(new Fruit());
//        superFruit.add(new Food());
        superFruit.add(new Fruit());

    }
}
