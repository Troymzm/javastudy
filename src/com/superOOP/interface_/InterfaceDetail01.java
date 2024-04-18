package com.superOOP.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

    }
}
// 接口不能被实例化
// 接口中所有的方法都是public 接口中抽象方法可以不用abstract修饰
// 一个普通类实现接口 就必须将该接口的所有方法都实现
// 抽象类去实现接口时可以不实现接口的抽象方法
interface IA {
    void say();
    void hi();
}
class Cat implements IA {

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
