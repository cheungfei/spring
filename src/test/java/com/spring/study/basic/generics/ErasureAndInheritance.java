package com.spring.study.basic.generics;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-06-06 17:46
 */
class GenericBase<T> {
    private T element;
    public void set(T arg) { arg = element; };
    public T get() { return element; };
}

class Derived1<T> extends  GenericBase<T> {}

class Derived2 extends GenericBase {}
// Raw use of parameterized class 'GenericBase'

//class Derived3 extends GenericBase<?> {}
// No wildcard expected

public class ErasureAndInheritance {
//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
        Object obj = d2.get();
        d2.set(obj);
//        Unchecked call to 'set(T)' as a member of raw type 'com.cnos.springboot.generics.GenericBase'
    }
}
