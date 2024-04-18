package com.maxsubarraysum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaxSubarray algorithm;
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] numarr;
        // 用户输入数组长度
        System.out.println("输入数组的长度: ");
        n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("数组长度不符合规范, 已为您退出!");
            return;
        }
        // 接收用户输入数组元素并构建数组
        numarr = new int[n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("输入数组第" + (i + 1) + "个元素: ");
            num = scanner.nextInt();
            numarr[i] = num;
        }
        int option = 0;
        System.out.println("请选择模式: ");
        System.out.println("1 ------ 暴力算法");
        System.out.println("2 ------ 优化算法");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                algorithm = new OriginAlgorithm();
                break;
            case 2:
                algorithm = new OptimizedAlgorithm();
                break;
            default:
                System.out.println("选择有误, 已为您退出!");
                return;
        }
        int maxSum = algorithm.maxSubarraySum(numarr);
        System.out.println("所求最大子数组的和为: " + maxSum);
    }
}
