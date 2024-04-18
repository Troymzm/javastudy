package com.superOOP.arrrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 90, 123, 567};
        // binarySearch 通过二分搜索法进行查找 必须排好序 不存在返回 -(应该在的位置 + 1)
        int index = Arrays.binarySearch(arr, 1);
        System.out.println(index);
        index = Arrays.binarySearch(arr, 568);
        System.out.println(index);

        // copyOf 数组元素的复制
        // 从 arr 中拷贝 arr.length 个数
        // 如果拷贝的长度大于arr.length 就在新数组后面插入0或者null
        int[] newarr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newarr));

        newarr = Arrays.copyOf(arr,arr.length - 1);
        System.out.println(Arrays.toString(newarr));

        newarr = Arrays.copyOf(arr,arr.length + 2);
        System.out.println(Arrays.toString(newarr));
//        Integer[] integers = {-1, 1, 2};
//        Integer[] newIntegers = Arrays.copyOf(integers, integers.length + 1);
//        System.out.println(Arrays.toString(newIntegers));
        // fill 数组元素的填充 替换所有元素
        Arrays.fill(arr, 99);
        System.out.println(Arrays.toString(arr));
        // equals
        System.out.println(Arrays.equals(arr, newarr));
        // asList 将一组值 转换为 List 编译类型为 List (接口) 运行类型为java.util.Arrays$ArrayList 静态内部类
        List asList = Arrays.asList(2, 3, 4, 5, 6, 1);
        System.out.println(asList);
        System.out.println(asList.getClass());
    }
}
