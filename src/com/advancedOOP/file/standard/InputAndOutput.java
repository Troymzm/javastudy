package com.advancedOOP.file.standard;

import java.util.Scanner;

/**
 * @author mzm
 * @version 1.0
 */
public class InputAndOutput {
    public static void main(String[] args) {
        // System.in 编译类型 InputStream 运行类型 BufferedInputStream 标准输入
        // System.out 编译类型 PrintStream 运行类型 PrintStream 标准输出
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容: ");
        String string = scanner.next();
        System.out.println(string);
    }
}
