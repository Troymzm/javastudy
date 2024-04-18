package com.superOOP.generic_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class Generic02 {
    public static void main(String[] args) {
        // 使用泛型 表示存放到集合中的元素是Dog类 如果编译器发现添加的类型不满足要求 就会报错
        // 在遍历的时候可以直接取出Dog类型 免得向下转型
        // public class ArrayList<E>() {} E 称为泛型 相当于 Dog -> E
        List<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("aa", 1));
        list.add(new Dog("bb", 2));
        list.add(new Dog("cc", 3));
        // list.add(new Cat("dd", 3)); 报错

        for (Dog dog :list) {
            System.out.println(dog.getName() + ": " + dog.getAge());
        }

    }
}
