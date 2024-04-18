package com.superOOP.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);
        System.out.println(Pig.n1);
        Pig pig = new Pig();
        System.out.println(pig.n1);
    }
}
interface IB {
    // 接口中的属性 只能是final的
    int n1 = 10; // 等价于 public static final int n1 = 10;
    void hi();
}
interface IC {
    void say();
}

// 一个类可以实现多个接口
class Pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
// 接口不能继承其他的类 但能继承多个别的接口
interface ID extends IB, IC {

}
// 接口的修饰符只能是public 或默认的