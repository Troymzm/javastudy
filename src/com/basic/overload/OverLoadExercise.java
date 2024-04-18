package com.basic.overload;

public class OverLoadExercise {
    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.m(2);
        methods.m(2, 3);
        methods.m("aaron");
        System.out.println(methods.max(1, 2));
        System.out.println(methods.max(1.1, 2.2));
        System.out.println(methods.max(1.1, 2.2, 3.3));
    }
}

class Methods {
    public void m(int n) {
        System.out.println(n * n);
    }

    public void m(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public void m(String str) {
        System.out.println(str);
    }

    public int max(int n1, int n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2) {
        return n1 > n2 ? n1 : n2;
    }

    public double max(double n1, double n2, double n3) {
        return (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
    }
}