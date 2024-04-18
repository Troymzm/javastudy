package com.superOOP.string_;

import java.util.Scanner;

/**
 * @author mzm
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        System.out.print("请输入价格: ");
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        String price = String.valueOf(p);
        StringBuffer sb = new StringBuffer(price);
        int index = sb.lastIndexOf(".");
//        if (index < 0) {
//            index = sb.length() - 1;
//        }
        for (int i = index - 3; i > 0 ; i-=3) {
            sb.insert(i, ",");
        }
        price = sb.toString();
        String format = "价格为: %s";
        price = String.format(format, price);
        System.out.println(price);
    }
}
