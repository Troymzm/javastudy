package com.basic.operator;

public class Plus {
    public static void main(String[] args) {
        System.out.println(100 + 98);
        System.out.println("100" + 98);
        System.out.println(100 + 98 + "com.basic.hello_.Hello");
        System.out.println("com.basic.hello_.Hello" + 100 + 98);
        // + 号的使用
        // 当左右两侧都是数值型时做加法运算 当左右两方有一方为字符串时做拼接运算 运算顺序为从左至右
    }
}
