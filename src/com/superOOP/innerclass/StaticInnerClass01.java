package com.superOOP.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        // 外部其他类 使用 静态内部类
        // 方式1
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        // 没有生成Outer10对象实例
        inner10.say();
        // 方式2
        Outer10.Inner10 inner10_1 = outer10.getInner10Instance();
        inner10_1.say();
        Outer10.Inner10 inner10_2 = Outer10.getInner10Instance01();
        inner10_2.say();
        // 如果访问内部类的静态方法 可以不用new
        Outer10.Inner10.hello();
    }
}

class Outer10 {
    private int n1 = 10;
    public static String name = "aaron";
    private static void cry() {

    }
    // 静态内部类
    static class Inner10 {
        public static String name = "fsl";
        // 可以直接访问外部类的所有静态成员 可以添加任意修饰符 作用域同其他成员
        public void say() {
            System.out.println(name);
            System.out.println(Outer10.name);
            cry();
        }
        public static void hello() {
            System.out.println("hello");
        }
    }
    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
    public Inner10 getInner10Instance() {
        return new Inner10();
    }
    public static Inner10 getInner10Instance01() {
        return new Inner10();
    }
}