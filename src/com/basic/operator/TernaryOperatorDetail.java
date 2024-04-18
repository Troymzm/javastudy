package com.basic.operator;

public class TernaryOperatorDetail {
    public static void main(String[] args) {
        // 表达式1和表达式2要为可以赋给接受变量的类型(或可以自动转换或强制转换)
        int a = 3;
        int b = 8;
        int c = a > b ? 1 : 3;
        double d = a > b ? a : b + 3;  // 可以自动转换
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
