package com.superOOP.arrrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author mzm
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {20, 90, 1};
        // 遍历数组
        for (int i : integers) {
            System.out.println(i);
        }
        // 直接使用Arrays.toString 显示数组
        System.out.println(Arrays.toString(integers));

        // 演示 sort 方法的使用
        // 因为数组是引用类型 通过sort排序后会直接影响实参
        Arrays.sort(integers); // 默认排序
        System.out.println(Arrays.toString(integers));
        // sort 重载的 也可以通过接口 Comparator 进行定制排序 从小到大
        Arrays.sort(integers, new Comparator() { // 匿名内部类
            // 传入两个参数 排序的数组 和 实现了Comparator 接口的匿名内部类 要求实现compare方法
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1; // 从大到小
            }
        });
        System.out.println(Arrays.toString(integers));
    }
}
