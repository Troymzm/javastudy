package com.superOOP.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA {
    {
        System.out.println("AAA 普通代码块");
    }
    public AAA () {
        // super()
        // 调用本类的普通代码块
        System.out.println("AAA 无参构造器");
    }
}
class BBB extends AAA {
    {
        System.out.println("BBB 普通代码块");
    }
    public BBB () {
        System.out.println("BBB 无参构造器");
    }
}
