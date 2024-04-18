package com.basic.loop.dowhile;

import java.util.Scanner;

public class DoWhileExercise02 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        char answer;
        do {
            System.out.println("还钱吗? y / n");
            answer = myScanner.next().charAt(0);
            System.out.println("你的答案是" + answer);
        } while (answer != 'y');
    }
}
