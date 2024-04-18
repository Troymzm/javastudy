package com.OOP.encap;

public class Account {
    // 为了封装 全部设置为private
    private String name;
    private double balance;
    private String pwd;

    // 提供2个构造器

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名要求(长度为2位到4位)，默认值 无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须>20，默认值 0");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须为6位，默认值 000000");
            this.pwd = "000000";
        }
    }

    // 显示账户信息
    public void showInfo() {
        System.out.println(this.name);
        System.out.println(this.balance);
        System.out.println(this.pwd);
    }
}
