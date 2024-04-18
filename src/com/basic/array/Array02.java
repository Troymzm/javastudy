package com.basic.array;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        // 声明并开辟空间
        double scores[] = new double[5];
        // 或者先声明 double scores[]; 再开辟空间 scores = new double[5];
        // 赋值
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个成绩");
            scores[i] = myScanner.nextDouble();
        }
        // 输出 遍历数组
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个成绩为" + scores[i]);

        }
    }
}
