package com.brianway.learning.java.base.typeinfo;

public class GenericClassReferences {
    public static void main(String[] args) {

        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        System.out.println(genericIntClass.toString());

        Class intClass = int.class;//其实不懂 class a = x.class；
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
        System.out.println(genericIntClass.getClass().getName() == intClass.getClass().getName());

        System.out.println(int.class == Integer.class);
    }
} ///:~
