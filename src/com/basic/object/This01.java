package com.basic.object;

public class This01 {
    public static void main(String[] args) {
        PersonThis p1 = new PersonThis("jack", 18);
        System.out.println(p1.age);
    }
}

class PersonThis {
    String name;
    int age;

    public PersonThis(String name, int age) {
        this.name = name;
        this.age = age;
    }
}