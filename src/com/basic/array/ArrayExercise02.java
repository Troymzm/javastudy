package com.basic.array;

public class ArrayExercise02 {
    public static void main(String[] args) {
        int num[] = { 4, -1, 9, 10, 23 };
        int max_num = num[0], max_index = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max_num) {
                max_num = num[i];
                max_index = i;
            }
        }
        System.err.println("最大值为" + max_num);
        System.out.println("最大值所对应的下标为" + max_index);
    }
}
