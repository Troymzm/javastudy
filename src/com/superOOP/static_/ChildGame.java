package com.superOOP.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child aaron = new Child("Aaron");
        Child.count ++;
        aaron.join();
        Child apple = new Child("apple");
        Child.count ++;
        apple.join();
        Child banana = new Child("banana");
        Child.count ++;
        banana.join();
        System.out.println(Child.count);
    }
}
class Child {
    private String name;
    // 定义一个变量 count 是一个类变量(静态变量) static 静态 该变量会被该类所有对象实例共享 在类加载的时候就生成了
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}
