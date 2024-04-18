package com.basic.array;

import java.util.Scanner;

public class ArrayHomework02 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = { 10, 12, 45, 90 };
        System.out.println("输入要添加的元素:");
        int num = myScanner.nextInt();
        int arr_New[] = new int[arr.length + 1];
        int index = 0;
        if (num >= arr[arr.length - 1]) {
            index = arr.length;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (num < arr[i]) {
                    index = i;
                    break;
                }
            }
        }

        for (int i = 0; i < arr_New.length; i++) {
            if (i < index) {
                arr_New[i] = arr[i];
            } else if (i == index) {
                arr_New[i] = num;
            } else {
                arr_New[i] = arr[i - 1];
            }
        }

        arr = arr_New;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
    }
}
