package com.superOOP.exception_;

/**
 * @author mzm
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            System.out.println("出现异常的原因: " + e.getMessage());
        }
        // 程序会抛出异常 ArithmeticException (数学运算异常) 程序终止 -- 使用异常处理机制
        // 如果程序员认为一段代码可能出现异常 可以使用try-catch异常处理机制来解决 快捷键 ctrl + alt + t
        System.out.println("程序继续运行");
    }
}
