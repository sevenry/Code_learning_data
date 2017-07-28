package com.brianway.learning.java.base.generics;

public class GenericArray2<T> {
    private Object[] array;

    public GenericArray2(int sz) {
        array = new Object[sz];
    }
    
    public GenericArray2(String sz) {
        array = new Object[10];
    }

    public void put(int index,T item) {
        array[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    public T[] rep() {
        return (T[]) array; // Warning: unchecked cast
    }

    public static void main(String[] args) {
        GenericArray2<String> gai =
                new GenericArray2<String>("w");//第二个这里传参，构造方法的话，可以是同一个名字不同的参数来接收
        GenericArray2<Integer> gai1 =
                new GenericArray2<Integer>(10);
        for (int i = 0; i < 10; i++)
            gai.put(i, "w");
        for (int i = 0; i < 10; i++)
            gai1.put(i, i);
       
        for (int i = 0; i < 10; i++)
            System.out.print(gai.get(i) + " ");
        System.out.println();
        try {
            String[] ia = gai.rep();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
} /* Output: (Sample)
0 1 2 3 4 5 6 7 8 9
java.lang.ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.Integer;
*///:~
