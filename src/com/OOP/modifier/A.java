package com.OOP.modifier;

public class A {
    // 四个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public void m1() {
        // 该方法可以访问 四个属性
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
    protected void m2() {

    }
    void m3() {

    }
    private void m4() {

    }
    public void hi() {
        // 同一类中 都可以使用
        m1();
        m2();
        m3();
        m4();
    }
}
