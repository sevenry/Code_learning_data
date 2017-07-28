package com.brianway.learning.java.base.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<Apple>();
        // Compile Error: can't add any type of object:
        // flist.add(new Apple());
        //flist.add(new Fruit());
        // flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know that it returns at least Fruit:
        Fruit f = flist.get(0);//这里一定会报错，因为声明了必须是Fruit，因此不可以这里用Apple做引用
        //但是接收的对象是Apple类型，这里得到的对象类型是Apple，和Fruit不符
        //System.out.println(flist.get(0).getClass().getName());
        System.out.println(f.getClass().getName());
    }
} ///:~
