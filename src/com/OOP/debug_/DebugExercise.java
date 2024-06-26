package com.OOP.debug_;

public class DebugExercise {
    public static void main(String[] args) {
        /*
        创建对象流程
        1. 加载类信息
        2. 初始化 默认初始化 显式初始化 构造器初始化
        3. 返回对象的地址
         */
        Person person = new Person("jack", 12);
        System.out.println(person);
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
