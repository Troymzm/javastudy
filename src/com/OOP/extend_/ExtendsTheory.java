package com.OOP.extend_;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();
        // 首先看子类是否有该属性 如果子类有这个属性 并且可以访问则返回信息 如果子类没有这个属性则看父类有没有这个属性，并且可以访问，就返回信息
        System.out.println(son.name);
        System.out.println(son.getAge());
        System.out.println(son.hobby);
    }
}
class GrandPa {
    String name = "大头爷爷";
    int age = 100;
    String hobby = "旅游";
}
class Father extends GrandPa {
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }
}
class Son extends Father {
    String name = "大头儿子";
}
