package com.basic.if_;

import java.util.Scanner;

public class NextedIf {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = myScanner.nextDouble();
        if (score > 8.0) {
            System.out.println("请输入性别");
            char gender = myScanner.next().charAt(0);
            if (gender == '男') {
                System.out.println("您已进入男子组决赛");
            } else if (gender == '女') {
                System.out.println("您已进入女子组决赛");
            } else {
                System.out.println("您输入的性别有误, 不能参加决赛");
                System.out.println(gender);
            }
        } else {
            System.err.println("您已经被淘汰");
        }
    }
}
