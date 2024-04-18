package com.basic.object;

public class ThisDetail {
    public static void main(String[] args) {
        TestThis t = new TestThis();
        t.f2();
        t.f3();
    }
}

class TestThis {
    String name;
    int age;

    public TestThis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * 访问构造器语法 : this(参数列表)；
     * 注意只能在构造器中使用(即只能在构造器中访问另外一个构造器)
     * 如果有必须放在第一条语句
     */
    public TestThis() {
        this("jack", 100);
    }

    // 访问成员方法的语法 this.方法名(参数列表)
    public void f1() {
        System.out.println("f1()方法 ... ");
    }

    public void f2() {
        System.out.println("f2()方法 ... ");
        // 调用本类的f1
        // 第一种方式
        f1();
        // 第二种方式
        this.f1();
    }

    // this 语句可以访问本类的属性
    public void f3() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
