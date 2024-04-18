package com.OOP.override_;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public String say() {
        return "name=" + name + " age=" + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
