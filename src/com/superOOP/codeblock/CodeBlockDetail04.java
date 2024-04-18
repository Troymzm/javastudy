package com.superOOP.codeblock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        new BBBBB();
    }
}

class AAAAA {
    private static int n1 = getN1();
    private int n2 = getN2();
    static {
        System.out.println("AAAAA 静态代码块");
    }
    {
        System.out.println("AAAAA 普通代码块");
    }
    public AAAAA() {
        System.out.println("AAAAA 无参构造器");
    }
    private static int getN1() {
        System.out.println("AAAAA 静态方法");
        return 100;
    }
    private static int getN2() {
        System.out.println("AAAAA 普通方法");
        return 100;
    }
}
class BBBBB extends AAAAA {
    private static int n1 = getN1();
    private int n2 = getN2();
    static {
        System.out.println("BBBBB 静态代码块");
    }
    {
        System.out.println("BBBBB 普通代码块");
    }
    public BBBBB() {
        System.out.println("BBBBB 无参构造器");
    }
    private static int getN1() {
        System.out.println("BBBBB 静态方法");
        return 100;
    }
    private static int getN2() {
        System.out.println("BBBBB 普通方法");
        return 100;
    }
}
// 静态代码块只能调用静态成员 普通代码块可以调用任意成员
