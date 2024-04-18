package com.basic.if_;

import java.util.Scanner;

public class IfExercise01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        // 判断一个年份是否为闰年
        // 思路分析
        /*
         * 1. 定义 int year 保存年
         * 2. 年份能被4整除但不能被100整除
         * => yesr % 4 == 0 && year / 100 != 0
         * 3. 能被400整除
         * => year % 400 == 0
         * 4. 上面的 2 和 3 是 或的关系
         */
        System.out.println("请输入年份");
        int year = myScanner.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}
