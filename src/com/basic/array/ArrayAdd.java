package com.basic.array;

import java.util.Scanner;

public class ArrayAdd {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = { 1, 2, 3 };
        char flag = 'n';
        do {
            System.out.println("输入要添加的元素: ");
            int num = myScanner.nextInt();
            int len = arr.length;
            int newLen = len + 1;
            int arrNew[] = new int[newLen];
            for (int i = 0; i < len; i++) {
                arrNew[i] = arr[i];
            }
            arrNew[len] = num;
            arr = arrNew;
            System.out.println("是否继续添加 y/n");
            flag = myScanner.next().charAt(0);
        } while (flag == 'y');
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
