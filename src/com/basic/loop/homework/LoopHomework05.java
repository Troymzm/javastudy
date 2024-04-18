package com.basic.loop.homework;

public class LoopHomework05 {
    public static void main(String[] args) {
        int sum = 0, total_sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            total_sum += sum;
        }
        System.out.println(total_sum);
    }
}
