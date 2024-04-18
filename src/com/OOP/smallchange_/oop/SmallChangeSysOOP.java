package com.OOP.smallchange_.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";
    String details = "==========零钱通明细==========";
    double money = 0;
    double balance = 0;
    String note = "";
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    public void mainMenu(){
        do{
            System.out.println("==========零钱通菜单==========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退出");
            System.out.print("请选择(1-4): ");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        } while (loop);
    }
    public void detail() {
        System.out.println(details);
    }
    public void income() {
        System.out.print("收益入账金额: ");
        money = scanner.nextDouble();
        balance += money;
        // 找出不正确的并给出提示
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return;
        }
        // 拼接收益入账信息
        date = new Date();
        details += "\n收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
    }
    public void pay() {
        System.out.print("消费金额: ");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("消费金额 需要 大于 0");
            return;
        }
        if (money > balance) {
            System.out.println("消费金额应该在 0-" + balance);
            return;
        }
        System.out.print("消费说明: ");
        note = scanner.next();
        balance -= money;
        // 拼接收益入账信息
        date = new Date();
        details += "\n" + note + "\t" + "-" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
    }
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("确定退出? y/n :" );
            choice = scanner.next();
            if ("y".equals(choice)||"n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}
