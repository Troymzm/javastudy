package com.basic.array;

public class TwoDimensionalArray03 {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        for (int i = 0; i < arr.length; i++) {
            // 给每个一维数组开空间
            arr[i] = new int[i + 1];
            // 赋值
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }

        }
        // 遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
