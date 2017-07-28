package com.brianway.learning.java.base.generics;

import java.util.ArrayList;
import java.util.List;

//? super T 是下界通配符，指类会被转型为T或者其父类，因此可以插入该类的子类都是没有问题的。但是不能插入该类的父类。
//? extends T 是上界通配符，指类会被转型T或者其子类，因此无法插入元素，但是可以读取。因为每一个一定属于T；
public class GenericWriting {
    // 使用确切参数类型
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<Apple>();
    static List<Fruit> fruit = new ArrayList<Fruit>();

    static void f1() {
        writeExact(apples, new Apple());
        // writeExact(fruit, new Apple()); // Error:
        // Incompatible types: found Fruit, required Apple
    }

    //
    static <T> void
    writeWithWildcard(List<? super T> list, T item) {
        //list.remove(item);//如果是删除元素的话，那么super和extends都是可以的。
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        //writeWithWildcard(fruit, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
} ///:~
