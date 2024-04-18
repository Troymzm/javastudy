package com.superOOP.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author mzm
 * @version 1.0
 */
public class ThrowsDetail {
    public static void main(String[] args) {

    }
    public static void f2() /*throws ArithmeticException*/ {
        /*
        1. 对于编译异常 程序中必须处理 使用try catch 或 throws
        2. 对于运行时异常 程序中如果没有处理 默认就是throws的方式处理
        3. 子类重写的方法所抛出的异常类型要么和父类一致 要么是父类抛出异常类型的子类
         */
        int n1 = 10;
        int n2 = 0;
        System.out.println(n1 / n2);
    }
    public static void f1() throws FileNotFoundException{
        f3(); // 抛出异常 编译异常未处理 在f1中要么try catch 要么继续throws
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
    public static void f4() {
        f5(); // 抛出的是运行异常 有默认处理机制
    }
    public static void f5() throws ArithmeticException{

    }
}
class Father {
    public void method() throws RuntimeException {

    }
}
class Son extends Father{
    @Override
    public void method() throws NullPointerException {
    }
}
