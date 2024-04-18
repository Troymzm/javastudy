package com.superOOP.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
        // 包装类 如 String 是 Final 类 不能被继承
    }
}
final class AAA {
    // 没有意义 画蛇添足
    public final void cry() {}
    // final不能修饰构造器
}
// final static 往往搭配使用 不会导致类加载 底层编译器做了优化处理
class BBB {
    public final static int num = 10000;
    static {
        System.out.println("BBB 静态代码块执行");
    }
}