package com.basic.var;

public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod method = new HspMethod();
        int num1 = method.sum(1, 2, 3, 4, 5);
        System.out.println(num1);
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int num2 = method.sum(arr);
        System.out.println(num2);
        System.out.println(method.showScore("Jack", 1.1, 90.1, 100));

    }
}

class HspMethod {
    // 可以计算2个数 3个数 4个数 ... 的和
    /*
     * int... 表示接收的是可变参数 类型是int 即可以接收多个int
     * 使用可变参数时 可以当做数组来使用
     * 可变参数的实参可以为数组
     * 可变参数可以和普通类型的参数一起放在形参列表 但必须保证可变参数在最后
     * 一个形参列表中只能有一个可变参数
     */
    public int sum(int... nums) {
        System.out.println("接收参数个数是" + nums.length);
        int sumNum = 0;
        for (int i = 0; i < nums.length; i++) {
            sumNum += nums[i];
        }
        return sumNum;
    }

    public String showScore(String name, double... scores) {
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        return name + scores.length + "门课的成绩的总分为" + total;
    }
}