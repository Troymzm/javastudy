package com.OOP.pkg;

import com.OOP.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 在不同包下 可以访问public 修饰的属性或方法 但不能访问其他修饰符修饰的属性或方法
        System.out.println(a.n1);
        a.m1();
    }
}
