package com.superOOP.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        // 接口的多态
        // 接口类型的变量 if01 可以指向 实现了 IF 接口 的 对象实例 类似于 继承的多态
        IF if01 = new Monster();
        if01 = new Car();
    }
}

interface IF {}
class Monster implements IF {}
class Car implements IF {}