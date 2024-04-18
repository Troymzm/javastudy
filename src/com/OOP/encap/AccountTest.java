package com.OOP.encap;

public class AccountTest {
    public static void main(String[] args) {
        // 创建对象
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("000000");
        account.showInfo();
    }
}
