package com.basic.array;

public class Array01 {
    public static void main(String[] args) {
        // double[] 表示 是double类型的数组 数组名 hens
        double[] hens = { 3, 5, 1, 3.4, 2, 50 };
        double totalWeight = 0;
        // 遍历数组得到数组的所有元素的和 使用for
        // 可以通过 数组名.length 得到数组的大小/长度
        for (int i = 0; i < hens.length; i++) {
            System.out.println("第" + (i + 1) + "个元素是" + hens[i]);
            totalWeight += hens[i];
        }
        System.out.println("总体重为" + totalWeight);
        System.out.println("平均体重为" + (totalWeight / hens.length));
    }
}
