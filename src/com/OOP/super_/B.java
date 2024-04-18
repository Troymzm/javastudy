package com.OOP.super_;

public class B extends A {
    public int n1 = 888;
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }

    public void cal() {
        System.out.println("B");;
    }

    public void sum() {
        // 查找过程中 如果不能访问 则报错
        System.out.println("B1");
        cal();
        System.out.println("B2");
        this.cal();
        // 调用父类的cal方法 super直接查找父类
        System.out.println("B3");
        super.cal();

        System.out.println("B1");
        System.out.println(n1);;
        System.out.println("B2");
        System.out.println(this.n1);;
        // super直接查找父类
        System.out.println("B3");
        System.out.println(super.n1);;
    }
    public B() {
        super(1);
    }
    public void test() {
        System.out.println(super.n1);
        System.out.println(super.age);
        super.eat();
    }
}
