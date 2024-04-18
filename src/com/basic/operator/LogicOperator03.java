package com.basic.operator;

public class LogicOperator03 {
    public static void main(String[] args) {
        // ! 和 ^ 演示
        System.out.println(60 > 20);
        System.out.println(!(60 > 20));  // ! 取反
        // a ^ b 逻辑异或 当 a 和 b 不同时 结果为true 否则为false
        boolean b = (10 > 1) ^ (3 < 5); // false
        System.out.println(b);
    }
}
