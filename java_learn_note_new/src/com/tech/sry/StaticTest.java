package com.tech.sry;

public class StaticTest {
    private static int staticInt = 2;
    //无论创建多少个实例对象，  永远都只分配了一个 staticInt 变量
    private int random = 2;

    public StaticTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = "+random);
    }

    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        StaticTest test2 = new StaticTest();
    }
}