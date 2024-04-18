package com.OOP.pkg;

// 注意：我们需要使用哪个类 就导入哪个类即可 不建议使用*导入

import java.util.Arrays;

public class Import01 {
     public static void main(String[] args) {
         // 使用系统提供的Arrays完成数组排序
         int[] arr = {-1, 20, 2, 13, 3};
         Arrays.sort(arr);
         // 输出排序结果
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + "\t");
         }
     }
}
