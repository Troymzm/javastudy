package com.superOOP.arrrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mzm
 * @version 1.0
 */
public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 8, 0, 20};
        bubble01(arr);
        System.out.println(Arrays.toString(arr));

        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
    // 冒泡排序
    public static void bubble01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 从小到大
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    // 结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 数组排序由 c.compare(arr[j], arr[j + 1]) 返回的值决定
                if (c.compare(arr[j], arr[j + 1]) > 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
