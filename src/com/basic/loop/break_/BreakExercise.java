package com.basic.loop.break_;

import java.util.Scanner;

public class BreakExercise {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        String name = "丁真";
        int try_num = 3;
        int password = 666;
        for (int i = 1; i <= try_num; i++) {
            System.out.println("请输入用户名");
            String try_name = myScanner.next();
            System.out.println("请输入密码");
            int try_password = myScanner.nextInt();
            if (try_name.equals(name) && try_password == password) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("登录失败, 还有" + (try_num - i) + "次机会");
            }
        }
    }
}
