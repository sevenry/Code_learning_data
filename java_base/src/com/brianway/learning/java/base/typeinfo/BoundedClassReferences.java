package com.brianway.learning.java.base.typeinfo;

public class BoundedClassReferences {
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;//Number是一个抽象类。
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number.
        System.out.println(bounded.getClass().getName());
    }
} ///:~
