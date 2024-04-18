package com.superOOP.interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}

// 如果一个类 implements 实现 接口 需要将接口的所有抽象方法实现
class A implements AInterface {
    @Override
    public void hi() {
        System.out.println("......");
    }
}