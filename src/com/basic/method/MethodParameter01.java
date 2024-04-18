package com.basic.method;

public class MethodParameter01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        AA02 a = new AA02();
        a.swap(num1, num2);
        System.out.println("a=" + num1 + "b=" + num2);
    }
}

class AA02 {
    public void swap(int a, int b) {
        System.out.println("交换前a=" + a + "b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("交换后a=" + a + "b=" + b);
    }
}