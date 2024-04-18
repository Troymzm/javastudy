package com.basic.recursion;

public class RecursionExercise01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        int num = t1.fibonacci(7);
        if (num != 0) {
            System.out.println(num);
        }
        int peach_num = t1.peach(5);
        if (peach_num != -1) {
            System.out.println(peach_num);
        }
    }
}

class T1 {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("要求输入大于等于1的整数");
            return 0;
        }
    }

    public int peach(int day) {
        if (day == 10) {
            return 1; // 第10天只有1个桃子
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("需要在1 - 10天以内");
            return -1;
        }
    }
}