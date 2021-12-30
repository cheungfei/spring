package com.spring.study;

public class Test1 {
    public static void main(String[] args) {
        long a = 2;
        long b = 3;
        double c = a / b;
        System.out.println(c);

        long a1 = 2;
        long b1 = 3;
        // 或者 double ad = (double) a;
        // double c = ad / b;
        double c1 = (double) a1 / b1;
        System.out.println(c1);

        long a2 = 2000000000;
        int b2 = 100000;
        String c2 = String.valueOf(a2 / b2);
        System.out.println(c2);
    }
}
