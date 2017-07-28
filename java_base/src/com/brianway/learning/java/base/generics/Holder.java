package com.brianway.learning.java.base.generics;


public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Ap = new Holder<Apple>(new Apple());
        Apple d = Ap.get();
        //Ap.set(d);
        // Holder<Fruit> Fruit = Apple; // Cannot upcast
        Holder<? extends Fruit> fruit = Ap; // OK
        Fruit p = fruit.get();
        //d = (Apple) fruit.get(); // Returns 'Object'
        try {
            System.out.println("ww");
            //Fruit c = (Fruit) fruit.get(); // No warning
            Orange cOrange = (Orange) fruit.get();
            System.out.println("w");
        } catch (Exception e) {
            System.out.println(e);
        }
        // fruit.set(new Apple()); // Cannot call set()
        // fruit.set(new Fruit()); // Cannot call set()
        System.out.println(fruit.equals(d)); // OK
    }
}
/* Output: (Sample)
java.lang.ClassCastException: com.brianway.learning.java.base.generics.Apple cannot be cast to com.brianway.learning.java.base.generics.Orange
true
*///:~
