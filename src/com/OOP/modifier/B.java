package com.OOP.modifier;

public class B {
    public void say() {
        A a = new A();
        // 在同一个包下 可以访问 public protected 和 默认的 不能访问private
        System.out.println(a.n1);
        System.out.println(a.n2);
        System.out.println(a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}
