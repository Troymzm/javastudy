package com.basic.method;

public class MethodParameter02 {
    public static void main(String[] args) {
        AAA a = new AAA();
        Person09 p = new Person09();
        int[] arr = { 1, 2, 3 };
        a.test100(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        p.name = "Jack";
        p.age = 10;

        a.test400(p);
        System.out.println(p.age);
        a.test200(p);
        System.out.println(p.age);
        a.test300(p);
        System.out.println(p.age);
    }
}

class AAA {
    public void test100(int[] arr) {
        arr[0] = 100;
    }

    public void test200(Person09 p) {
        p.age = 10000; // 修改对象属性
    }

    public void test300(Person09 p) {
        p = null; // 不改变主栈
    }

    public void test400(Person09 p) {
        p = new Person09();
        p.age = 10000; // 修改对象属性
    }
}

class Person09 {
    String name;
    int age;
}