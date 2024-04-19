package com.superOOP.generic.customgeneric;

import java.util.ArrayList;

/**
 * @author mzm
 * @version 1.0
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("aaron", 100); // 当调用方法时 传入参数 编译器就会确定类型
        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(), 113.f);
    }
}
// 泛型方法 可以定义在普通类中 也可以定义在泛型类中
class Car {
    public void run() {};
    public <T, R> void fly(T t, R r) {
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    };
}
class Fish<T, R> {
    public void run() {};
    public <U, M> void fly(U u, M m) {};
    public void hi(T t){
        // 不是泛型方法 而是方法使用了类声明的泛型
    }
    // 泛型方法 也可以使用类声明的泛型 也可以自己声明泛型
    public <K> void hello(R r, K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}
