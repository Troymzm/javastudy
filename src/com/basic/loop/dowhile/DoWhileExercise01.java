package com.basic.loop.dowhile;

public class DoWhileExercise01 {
    public static void main(String[] args) {
        int i = 1, count = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i);
                count++;
            }
            i++;
        } while (i <= 200);
        System.out.println("总数为" + count);
    }
}
