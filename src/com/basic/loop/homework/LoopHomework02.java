package com.basic.loop.homework;

public class LoopHomework02 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i);
                System.out.print('\t');
                num++;
            }
            if (num == 5) {
                System.out.print('\n');
                num = 0;
            }
        }
    }
}
