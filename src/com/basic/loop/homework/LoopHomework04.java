package com.basic.loop.homework;

public class LoopHomework04 {
    public static void main(String[] args) {
        double result = 0.0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result -= 1.0 / i;
            } else {
                result += 1.0 / i;
            }
        }
        System.out.println(result);
    }
}
