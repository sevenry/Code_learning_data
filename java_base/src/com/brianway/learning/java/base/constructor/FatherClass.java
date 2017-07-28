package com.brianway.learning.java.base.constructor;

/**
 * Created by Brian on 2016/4/14.
 */
public class FatherClass {
    protected static int count = 10;
    private String name;

    static {
        System.out.println("燎沉香" + count);
    }

    
    public FatherClass() {
        System.out.println("消溽暑");
    }

    public FatherClass(String name) {
        this.name = name;
        System.out.println("鸟雀呼晴FatherClass(String name) " + name);
    }
}
