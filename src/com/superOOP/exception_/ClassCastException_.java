package com.superOOP.exception_;

/**
 * @author mzm
 * @version 1.0
 */
public class ClassCastException_ { // 类型转换异常
    public static void main(String[] args) {
        A b = new B(); // 向上转型
        B b2 = (B)b;
        C c2 = (C)b;
    }
}
class A {}
class B extends A {}
class C extends A {}