package com.superOOP.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("aa", 18));
        list.add(new Dog("bb", 19));
        list.add(new Dog("cc", 20));

        // 使用迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        // 使用增强for
        for (Object object :list) {
            System.out.println(object);
        }

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

    @Override
    public String toString() {
        return  "name= " + name + ", age= " + age;
    }
}