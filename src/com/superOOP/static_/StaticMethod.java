package com.superOOP.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        Stu.payFee(100);
        Stu mary = new Stu("mary");
        Stu.payFee(200);
        Stu.showFee();
        // 类方法中不允许使用和对象有关的关键字 比如this和super 类方法只能访问静态变量或方法
        // 静态方法只能访问静态成员 非静态方法可以访问静态成员和非静态成员
        System.out.println(MyTools.calSum(1.1,2.2));
    }
}
class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    public static void payFee(double fee) {
        Stu.fee += fee;
    }
    public static void showFee() {
        System.out.println("总学费为: " + Stu.fee);
    }
}

class MyTools {
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}

