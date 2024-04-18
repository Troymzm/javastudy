package com.basic.object;

public class ObjectHomework01 {
    public static void main(String[] args) {
        A01 a01 = new A01();
        double arr[] = { 1.1, 2.2, 3.3, 4.4, 3.2 };
        Double res = a01.max(arr);
        if (res != null) {
            System.out.println(res);
        } else {
            System.out.println("输入有误");
        }

    }
}

class A01 {
    public Double max(double[] arr) {
        // 先判断是否为空 之后再判断是否有元素
        if (arr != null && arr.length > 0) {
            int max_index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > arr[max_index]) {
                    max_index = i;
                }
            }
            return arr[max_index];
        } else {
            return null;
        }
    }
}