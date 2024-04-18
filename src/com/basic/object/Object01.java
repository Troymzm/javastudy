package com.basic.object;

public class Object01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(); // 创建对象
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        cat1.weight = 22.5;
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        cat2.weight = 23.5;
        System.out.println(cat1.name + '\t' + cat1.age + '\t' + cat1.color + '\t' + cat1.weight);
        System.out.println(cat2.name + '\t' + cat2.age + '\t' + cat2.color + '\t' + cat2.weight);
    }
}

class Cat {
    // 属性
    String name;
    int age;
    String color;
    double weight;

    // 行为
}
