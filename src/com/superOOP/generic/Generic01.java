package com.superOOP.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("aa", 1));
        list.add(new Dog("bb", 2));
        list.add(new Dog("cc", 3));
        list.add(new Cat("dd", 3));
        for (Object object :list) {
            // 向下转型
            Dog dog = (Dog) object;
            System.out.println(dog.getName() + ": " + dog.getAge());
        }
        // 假如不小心添加了一个Cat -- ClassCastException
        // 传统方法不能对集合中的数据类型进行约束 并且向下转型效率低
    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
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
}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
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
}