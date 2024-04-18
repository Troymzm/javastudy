package com.superOOP.exception_;

import java.util.Scanner;

/**
 * @author mzm
 * @version 1.0
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        int num = 0;
        boolean flag = true;
        while(flag) {
            try {
                System.out.print("输入一个整数: ");
                str = scanner.next();
                num = Integer.parseInt(str);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("输入有误");
            }
        }
        System.out.println(num);
    }
}
