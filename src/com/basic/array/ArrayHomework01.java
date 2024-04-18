package com.basic.array;

public class ArrayHomework01 {
    public static void main(String[] args) {
        String str[] = new String[] { "aa", "bb", "cc" };
        boolean[] bar = new boolean[2]; // 默认false
        if (bar[0]) {
            str[0] = "dd";
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
