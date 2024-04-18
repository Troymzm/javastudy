package com.basic.char_;

public class Char01 {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '韩';
        char c4 = 97;
        char c5 = '\u5b5f';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println((int)c4);
        System.out.println(c5);
        System.out.println((int)c3);
        // char类型是可以进行运算的 相当于一个整数
        System.out.println('a' + 10);
        char c6 = 'b' + 1;
        System.out.println((int)c6);
        System.out.println(c6);
    }
}
