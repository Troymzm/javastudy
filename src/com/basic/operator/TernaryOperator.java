package com.basic.operator;

public class TernaryOperator {
    // 三元运算符的使用
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        // a > b 为 false 返回 b-- 先返回 b 的值 然后再 b - 1
        int result = a > b ? a++ : b--;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
