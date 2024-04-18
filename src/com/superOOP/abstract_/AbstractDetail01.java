package com.superOOP.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {

    }
}
abstract class A {
    /*
    1. 抽象类不能被实例化
    2. 抽象类不一定要包含abstract方法 而且可以有实现的方法
    3. 一旦类包含了abstract方法 则这个类必须声明为abstract
    4. abstract 只能修饰类和方法
     */
    public void hi() {
        System.out.println("你好");
    }
}
