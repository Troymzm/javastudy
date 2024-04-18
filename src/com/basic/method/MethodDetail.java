package com.basic.method;

public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();
        int res[] = a.getSumAndSub(1, 4);
        // 调用带参数的方法时 一定对应着参数列表传入相同类型或兼容类型的参数
        // 实参和形参的类型要一致或兼容 个数顺序必须一致
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}

/**
 * AA
 */
class AA {
    // 1. 一个方法最多有一个返回值 如果返回多个结果 返回数组
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    // 2. 返回类型可以为任意类型 包含基本类型或引用类型（数组，对象）
    // 3. 如果方法要求有返回数据类型 则方法体中最后执行的语句必须为 return 值; 而且要求返回值类型必须和return的值类型一致或兼容
    public double f1() {
        double d1 = 1.1 * 3;
        return d1;
    }

    // 如果方法是void 则方法体中可以没有return语句 或者只写return
    public void f2() {
        System.out.println("com.basic.hello_.Hello");
        return;
    }
    // 方法不能嵌套定义
}