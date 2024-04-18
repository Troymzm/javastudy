package com.basic.array;

public class ArrayAssign {
    public static void main(String[] args) {
        // 基本数据类型赋值 赋值方式为值拷贝
        int n1 = 10;
        int n2 = n1;

        n2 = 80;
        // n2的变化不会影响到n1
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        // 数组在默认情况下是引用传递 赋的值是地址 赋值方式为引用赋值
        int arr1[] = { 1, 2, 3 };
        int arr2[] = arr1;
        arr2[0] = 10;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1的" + i + "为" + arr1[i]);
        }

    }
}
