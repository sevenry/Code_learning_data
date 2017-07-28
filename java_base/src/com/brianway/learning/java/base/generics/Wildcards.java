package com.brianway.learning.java.base.generics;
//复习
/**
 * Exploring the meaning of wildcards.
 */
public class Wildcards {
    // Raw argument:
    static void rawArgs(Holder holder, Object arg) {//两种构造函数
        
        Object obj = holder.get();
        System.out.println(obj);
    }

    static void unboundedArg(Holder<?> holder, Object arg) {
        
        Object obj = holder.get();
        System.out.println(obj);
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T>
    T wildSubtype(Holder<? extends T> holder, T arg) {
       
        T t = holder.get();
        return t;
    }

    static <T>
    void wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        
        Object obj = holder.get();//利用基类Object来读取
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();
        // Or:
        //raw = new Holder();
        Holder<Long> qualified = new Holder<Long>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<Long>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);

        unboundedArg(raw, lng);
        unboundedArg(qualified, lng);
        unboundedArg(unbounded, lng);
        unboundedArg(bounded, lng);

        Long r2 = exact1(qualified);
        Object r3 = exact1(unbounded); // Must return Object
        Long r4 = exact1(bounded);

        Long r6 = exact2(qualified, lng);
        
        Long r10 = wildSubtype(qualified, lng);
        // OK, but can only return Object:
        //Object r11 = wildSubtype(unbounded, lng);//报错，先改了再说
        Long r12 = wildSubtype(bounded, lng);

        
        wildSupertype(qualified, lng);//这里是1，因为有set部分。
       
    }
} ///:~
