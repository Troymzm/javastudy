package com.basic.overload;

public class OverLoad01 {
    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(1, 2));
        System.out.println(mc.calculate(1.1, 2));
    }
}

class MyCalculator {
    // 构成重载
    public int calculate(int n1, int n2) {
        return n1 + n2;
    }

    public double calculate(double n1, double n2) {
        return n1 + n2;
    }

    public double calculate(double n1, int n2) {
        return n1 + n2;
    }

    public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}