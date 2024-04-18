package com.basic.loop.for_;

public class ForExercise {
    public static void main(String[] args) {
        // 打印1-100之间所有是9的倍数的整数 统计个数 及 总和
        int i, num = 0, sum = 0, start = 1, end = 100;
        for (i = start; i <= end; i++) {
            if (i % 9 == 0) {
                System.out.println(i);
                num++;
                sum += i;
            }
        }
        System.out.println("共有" + num + "个, 总和为" + sum);
    }
}
