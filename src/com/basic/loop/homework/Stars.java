package com.basic.loop.homework;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        int num;
        System.out.println("输入金字塔的行数");
        num = myScanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i == num) {
                for (int k = 1; k <= 2 * num - 1; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= num + i - 1; j++) {
                    if (j == num - i + 1 || j == num + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
