package com.basic.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 24, 69, 80, 57, 13 };
        int temp;
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}
