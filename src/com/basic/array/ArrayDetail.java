package com.basic.array;

public class ArrayDetail {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 1. 数组是多个相同类型数据的组合
        double[] array1 = { 0.1, 0.2, 100 };
        // 2. 数组中的元素可以是任何数据类型 包括基本类型和引用类型
        String[] array2 = { "北京", "上海" };
        // 3. 数组创建后如果没有赋值 有默认值
        short[] array3 = new short[3];
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        // 4. 数组的下标从0开始
        // 5. 下标不能越界
        // 6. 数组型数据是对象(object)
    }
}
