package com.basic.object;

public class ObjectHomework07 {
    public static void main(String[] args) {

    }
}

class Employee {
    String name;
    char gender;
    int age;
    String job;
    double sal;

    // 复用构造器
    public Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String job, double sal, String name, char gender, int age) {
        this(name, gender, age); // 使用前面的构造器 但必须放在第一句话
        this.job = job;
        this.sal = sal;
    }
}
