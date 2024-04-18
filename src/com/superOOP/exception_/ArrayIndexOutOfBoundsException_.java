package com.superOOP.exception_;

/**
 * @author mzm
 * @version 1.0
 */
public class ArrayIndexOutOfBoundsException_ { // 数组越界异常
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
