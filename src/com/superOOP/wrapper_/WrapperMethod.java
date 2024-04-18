package com.superOOP.wrapper_;

/**
 * @author mzm
 * @version 1.0
 */
public class WrapperMethod {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE); // 返回最大值
        System.out.println(Integer.MAX_VALUE); // 返回最小值

        System.out.println(Character.isDigit('a')); // 判断是否为数字
        System.out.println(Character.isLetter('a')); // 判断是否为字母
        System.out.println(Character.isUpperCase('a')); // 判断是否大写
        System.out.println(Character.isLowerCase('a')); // 判断是否小写

        System.out.println(Character.isWhitespace('a')); // 判断是否为空格
        System.out.println(Character.toUpperCase('a')); // 转成大写
        System.out.println(Character.toLowerCase('A')); // 转成小写
    }
}
