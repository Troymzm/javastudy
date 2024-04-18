package com.basic.if_;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        if (age >= 18) {
            System.out.println("您已经成年");
        } else {
            System.out.println("您没有成年");
        }
        System.out.println("程序继续");
    }
}
