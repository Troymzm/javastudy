package com.basic.hello_;

// 这是java的快速入门 演示java的开发步骤
// 对代码的相关说明
// public class com.basic.hello_.Hello 表示 com.basic.hello_.Hello 是一个类 是一个public公有的类
// com.basic.hello_.Hello{ } 表示一个类的开始和结束
// public static void main(String[] args) 表示一个主方法 即我们程序的入口
// main(){ } 表示方法的开始和结束
// System.out.println("hello, world~"); 表示输出"hello, world~"到屏幕
// ;表示语句结束
public class Hello {
    // 编写一个main主方法
    public static void main(String[] args) {
        System.out.println("hello, world~");
    }
}

// 一个源文件中最多只能有一个public类 其他类的个数不限
// Dog 是一个类
// 编译后 每一个类 都对应一个 .class
// 公有public类名必须与文件名相同
// 也可以将main方法写在非public类中 然后指定运行非public类 这样入口方法就是public类的main方法
class Dog1 {
    public static void note(String[] args) {
        System.out.println("hello, 小狗狗~");
    }
}