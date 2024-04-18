package com.superOOP.final_;

public class Final01 {
    public static void main(String[] args) {
        B b = new B();
//        b.TaxRate = 10;
    }
}

// 如果我们要求A类不能被其他类继承 可以用final修饰
final class A {

}

class B {
    // 如果我们要求hi不能被子类重写 可以使用final修饰
    public final void hi() {
        // 当不希望某个局部变量被修改 可以使用final修饰 被称为局部常量
        final double NUM = 0.01;
//        NUM = 0.09;
    }
    // 如果不希望某个属性的值被修改 可以用final修饰
    public final double TaxRate = 0.005;
}
class C extends B {
//    @Override
//    public void hi() {
//        super.hi();
//    }

}