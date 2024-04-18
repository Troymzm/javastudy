package com.basic.char_;

// 演示转义字符的使用
public class ChangeChar {
    // 编写一个main方法
    public static void main(String[] args) {
        // \t 一个制表位 实现对齐的功能
        System.out.println("北京\t天津\t上海");
        // \n 换行符
        System.out.println("北京\n天津\n上海");
        // \\ 一个\
        System.out.println("北京\\天津\\上海");
        System.out.println("北京\\\\天津\\\\上海");
        // \" 一个"
        System.out.println("北京\"天津\"上海");
        // \' 一个'
        System.out.println("北京\'天津\'上海");
        // \r 一个回车
        System.out.println("寒暑平教育\r北京"); // 输出 北京平教育
        System.out.println("寒暑平教育\r\n北京");

        // 练习
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000\t");

        // 示意
        // 下面代码完成 两个数相加
        // 定义变量
        int n1 = 10;
        int n2 = 30;
        // 求和
        int sum = n1 + n2;
        // 输出结果
        System.out.println("结果=" + sum);
    }
}
