package com.fiora.study.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
    public static void main(String[] args) {
        Person p1 = new Person(101);
        Person p2 = new Person(102);
        AtomicReference<Person> ar = new AtomicReference<>(p1);
        ar.compareAndSet(p1, p2);

        Person p3 = ar.get();
        System.out.println("p3 is: " + p3);
        System.out.println("p3.equals(p1) = " + p3.equals(p1));
        System.out.println("p3.equals(p2) = " + p3.equals(p2));
    }
}

class Person {
    volatile long id;

    public Person(long id) {
        this.id=  id;
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
