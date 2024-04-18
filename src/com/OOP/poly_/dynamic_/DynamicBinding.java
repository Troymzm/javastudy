package com.OOP.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B(); // 向上转型
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}

/*
java的动态绑定机制
1. 当调用对象方法的时候 该方法会和该对象的内存地址/运行类型绑定
2. 当调用对象属性时 没有动态绑定机制 哪里声明 哪里使用
 */

class A {
    public int i = 10;

    public int getI() {
        return i;
    }

    public int sum1() {
        return getI() + 10;
    }
    public int sum() {
        return i + 20;
    }
}
class B extends A {
    public int i = 20;

    public int getI() {
        return i;
    }
}
