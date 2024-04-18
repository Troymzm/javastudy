package com.basic.input;

import java.util.Scanner; // 表示把java.util下的Scanner包导入

public class Input {
    public static void main(String[] args) {
        // 接受用户的输入
        // 步骤
        // Scanner类 表示 简单文本扫描器 在java.util 包
        // 1. 引入 Scanner类所在的包
        // 2. 创建 Scanner 对象 new 创建一个对象
        // myscanner 就是 Scanner 类的对象
        @SuppressWarnings("resource") // 避免黄色字警告
        Scanner myscanner = new Scanner(System.in);
        // 3. 接收用户输入 使用相关方法
        System.out.println("请输入名字");
        String name = myscanner.next(); // 接收用户输入字符串
        System.out.println("请输入年龄");
        int age = myscanner.nextInt(); // 接收用户输入int
        System.out.println("请输入薪水");
        double sal = myscanner.nextDouble(); // 接收用户输入double
        System.out.println("人的信息如下");
        System.out.println("name=" + name + "age=" + age + "sal=" + sal);
    }
}