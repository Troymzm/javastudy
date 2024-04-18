package com.superOOP.annotation;

/**
 * @author mzm
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {

    }
}
class Father {
    public void fly() {

    }
}
class Son extends Father {
    // @Override 表示子类重写父类方法 如果没有写@Override依然重写
    // 写了@Override注解 编译器就会去检查该方法是否真的重写了父类的方法
    // @Override只能修饰方法
    // @Target 是修饰注解的注解 为元注解
    @Override
    public void fly() {
        super.fly();
    }
    // @interface 不是接口 而是一个注解类
}