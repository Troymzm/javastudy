package com.superOOP.static_;

public class VisitStatic {
    public static void main(String[] args) {
        // 类变量随着类的加载而创建 即使没有创建对象实例也可以访问
        System.out.println(A.name);
    }
}
class A {
    public static String name = "aaron";
    private int num = 0;
}
