package com.superOOP.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A {
    private int n2 = getN2();
    // 普通代码块和普通属性初始化调用的优先级一样
    {
        System.out.println("A 普通代码块1");
    }
    // 静态属性初始化
    private static int n1 = getN1();
    // 静态代码块和静态属性初始化调用的优先级一样
    static {
        System.out.println("A 静态代码块1");
    }
    public static int getN1() {
        System.out.println("getN1被调用");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2被调用");
        return 200;
    }
    // 无参构造器
    public A() {
        System.out.println("A的无参构造器");
    }
    /*
    创建一个对象时在一个类的调用顺序
    1. 静态代码块和静态属性初始化
    2. 普通代码块和普通属性初始化
    3. 调用构造方法
     */
}
