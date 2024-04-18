package com.basic.operator;

/*
 *  演示算数运算符的使用
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        // /使用
        System.out.println(10 / 4); // 得到2
        System.out.println(10.0 / 4); // 得到2.5
        double d = 10 / 4; // 2.0
        System.out.println(d);

        // % 取模 取余 a % b = a - a / b * b
        // -10 % 3 = -10 - (-10) / 3 * 3
        // 10 % -3 = 10 - 10 / (-3) * (-3) 
        // -10 % -3 = -10 - (-10) / (-3) * (-3)
        System.out.println(10 % 3);
        System.out.println(-10 % 3);
        System.out.println(10 % -3);
        System.out.println(-10 % -3);


        // ++ 的使用
        int i = 10;
        i++; // 自增 等价于 i = i + 1
        System.out.println(i);
        ++i; // 自增 等价于 i = i + 1
        System.out.println(i);

        // 作为表达式使用 前++先自增后赋值 后++先赋值后自增
        int j = 8;
        int k = ++j;
        System.out.println(j);
        System.out.println(k);

        int m = j ++;
        System.out.println(j);
        System.out.println(m);
    }
}
