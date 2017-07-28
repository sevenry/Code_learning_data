package com.brianway.learning.java.base.generics;

public class InheritBounds {
    public static void main(String[] args) {
        Solid2<Bounded> solid2 =
                new Solid2<Bounded>(new Bounded());
        solid2.color();
        solid2.getY();
        solid2.weight();
    }
}

class HoldItem<T> {
    T item;

    HoldItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}

class Colored2<T extends HasColor> extends HoldItem<T> {//参数来自于HasColor，本身类继承来自HoldItem。
    Colored2(T item) {
        super(item);
    }

    java.awt.Color color() {
        System.out.println("c2,color");
        return item.getColor();
    }
}

class ColoredDimension2<T extends Dimension & HasColor>
        extends Colored2<T> {
    ColoredDimension2(T item) {
        super(item);
    }

    int getX() {
        System.out.println("cd2,x");
        return item.x;
    }

    int getY() {
        System.out.println("cd2,y");
        return item.y;
    }

    int getZ() {
        System.out.println("cd2,z");
        return item.z;
    }
}

class Solid2<T extends Dimension & HasColor & Weight>
        extends ColoredDimension2<T> {
    Solid2(T item) {
        super(item);
    }

    int weight() {
        System.out.println("s2,weight");
        return item.weight();
    }
}

///:~
