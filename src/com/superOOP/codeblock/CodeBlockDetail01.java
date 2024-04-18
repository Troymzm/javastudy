package com.superOOP.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        // 类被加载的情况举例
        // 创建对象实例时
        // AA aa = new AA();
        // 创建子类对象实例 父类也会被加载
        BB bb = new BB();
        // 使用类的静态成员时
        System.out.println(Cat.n1);
        // 静态代码块是在类加载时执行的 而且只会执行一次
        DD dd = new DD();
        DD dd1 = new DD();
        // 普通代码块在new对象时 被调用 而且是每创建一个对象 就调用一次 和类是否被加载无关
        System.out.println(DD.n1);
    }
}
class AA {
    // 静态代码块 -- 只会执行一次
    static {
        System.out.println("AA静态代码块1");
    }
}

class BB extends AA {
    // 静态代码块
    static {
        System.out.println("BB静态代码块1");
    }
}

class Cat extends Animal {
    public static int n1 = 999;
    static {
        System.out.println("Cat静态代码块1");
    }
}
class Animal {
    static {
        System.out.println("Animal静态代码块1");
    }
}
class DD {
    public static int n1 = 888;
    static {
        System.out.println("DD静态代码块1");
    }
    {
        System.out.println("DD普通代码块1");
    }
}
