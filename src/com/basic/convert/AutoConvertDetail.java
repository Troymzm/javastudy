package com.basic.convert;

public class AutoConvertDetail {
    public static void main(String[] args) {
        // 有多种类型的数据混合运算时 系统首先自动将所有数据转成容量最大的那种数据类型 然后再进行计算
        int n1 = 10;
        // float n2 = n1 + 1.1 报错 因为结果是double型 大赋小 会报错
        float n2 = n1 + 1.1f;
        double n3 = n1 + 1.1;
        // byte char short 之间不会相互自动转换
        // byte 范围 -128 ~ 127
        // 如果是变量赋值 一定会直接判断类型
        byte n4 = 10;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);

        // byte short char 他们三者可以计算 在计算时首先转换为int类型
        byte b2 = 1;
        short s1 = 1;
        char c3 = 'b';
        int n5 = b2 + s1 + c3;
        System.out.println(n5);

        // boolean 不参与转换

        // 自动提升原则 表达式结果类型自动提升为 操作数中最大的类型
    }
}
