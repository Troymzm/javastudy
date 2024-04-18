package com.superOOP.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
// 抽象类的本质还是类 所以可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static String name = "aaron";
    public void hi() {
        System.out.println("hi");
    }
    public abstract void hello();
    public static void ok() {
        System.out.println("ok");
    }
}
// 如果一个类继承了抽象类 则他必须实现抽象类的所有抽象方法 除非他自己也声明为抽象类
abstract class E {
    public abstract void hi();
}
abstract class F extends E {

}
class G extends E {
    @Override
    public void hi() {
        // 有方法体就算实现
    }
}
// 抽象方法不能用private final static 来修饰