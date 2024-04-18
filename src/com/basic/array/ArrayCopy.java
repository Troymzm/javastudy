package com.basic.array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30 };
        // 创建一个新的数组arr2 开辟新的数据空间
        // 大小 arr1.length
        // 遍历 拷贝
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[0] = 100; // 修改arr2不会对arr1有影响
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
