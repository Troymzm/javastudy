package com.basic.object;

public class TestPerson {
    public static void main(String[] args) {
        PersonTest p1 = new PersonTest("Mary", 55);
        PersonTest p2 = new PersonTest("Aaron", 55);
        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p1));
    }
}

class PersonTest {
    String name;
    int age;

    // 构造器
    public PersonTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(PersonTest p) {
        return this.name.equals(p.name) && this.age == p.age;
    }
}
