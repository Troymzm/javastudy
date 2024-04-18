package com.basic.float_;

public class FloatDetail {
    public static void main(String[] args) {
        // Java 的浮点型常量(具体值)默认为double型 声明float型常量 需要加f或F
        float num1 = 1.1f;
        double num2 = 1.1;
        double num3 = 1.1f;

        // 十进制数形式
        double num4 = 0.123;
        double num5 = .123;

        // 科学计数法形式
        double num6 = 5.12e2;
        double num7 = 5.12e-2;


        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        // 浮点数使用陷阱 2.7 和 8.1 / 3 比较  当我们对运算结果是小数的进行相等判断时要小心
        // 应该是以两个数的差值的绝对值 在某个精度范围类判断
        double num8 = 2.7;
        double num9 = 8.1 / 3;
        System.out.println(num8);
        System.out.println(num9);
        if(num8 == num9) {
            System.out.println(1);
        }
        if(Math.abs(num8 - num9) < 0.000001) {
            System.out.println(2);
        }
    }
}
