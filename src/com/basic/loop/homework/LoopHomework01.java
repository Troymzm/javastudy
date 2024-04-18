package com.basic.loop.homework;

public class LoopHomework01 {
    public static void main(String[] args) {
        double money = 100000, rate = 0.05;
        int num = 0;
        while (true) {
            if (money >= 50000) {
                money = money * (1 - rate);
            } else {
                money -= 1000;
            }
            if (money >= 0) {
                num++;
            } else {
                break;
            }
        }
        System.out.println(num);
    }
}
