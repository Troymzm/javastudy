package com.basic.array;

public class ArrayHomework03 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            System.out.print('\t');
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("平均值为：" + sum / (double) arr.length);
        int index_max = 0, index_min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index_max]) {
                index_max = i;
            }
            if (arr[i] < arr[index_min]) {
                index_min = i;
            }
        }
        System.out.println();
        System.out.println("最大值对应的下标为" + index_max);
        System.out.println("最小值对应的下标为" + index_min);
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8) {
                System.err.println("出现8");
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.err.println("没有8");
        }
    }
}
