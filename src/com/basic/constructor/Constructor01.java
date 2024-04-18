package com.basic.constructor;

public class Constructor01 {
    public static void main(String[] args) {
        PersonCons p1 = new PersonCons("jack", 100);
        System.out.println(p1.name);
        PersonCons p2 = new PersonCons("lily");
        System.out.println(p2.name);
        PersonCons p3 = new PersonCons();
        System.out.println(p3.name);
    }
}

class PersonCons {
    String name;
    int age;

    // 构造器 -- 完成对象属性的初始化(不是创建对象)
    /*
     * 1. 构造器没有返回值 也不能写void
     * 2. 构造器的名称与类名一样
     * 3. 构造器参数列表规则与成员方法一样
     * 4. 如果没有定义构造器 系统会自动给类生成一个默认无参构造器 也叫默认构造器
     */
    public PersonCons(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    // 构造器的重载
    public PersonCons(String pName) {
        name = pName;
    }

    // 一旦定义了自己的构造器 默认的构造器就覆盖了 就不能再使用默认的无参构造器 除非显式地定义一下
    public PersonCons() {
        name = "aaron";
    }
}
