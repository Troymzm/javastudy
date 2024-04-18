package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringHomework03 {
    public static void main(String[] args) {
        String name = "Meng Zhao Ming";
        printName(name);
    }
    public static void printName(String str) {
        if (str == null) {
            System.out.println("不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("格式错误");
            return;
        }
        String format = String.format("%s, %s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
