package com.superOOP.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    // eat 实现了 但没有意义 -- 父类方法不确定性问题
    // 考虑抽象方法 抽象方法就是没有实现的方法 没有实现指的是没有方法体
    // 当一个类存在抽象方法时 需要将该类声明为抽象类
    // 一般来说 抽象类会被继承 由其子类来实现抽象方法
//    public void eat() {
//        System.out.println("这是一个动物, 但不知道吃什么");
//    }
    public abstract void eat();
}