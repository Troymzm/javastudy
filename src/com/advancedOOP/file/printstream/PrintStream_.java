package com.advancedOOP.file.printstream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author mzm
 * @version 1.0
 * 字节打印流
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        // 默认 PrintStream 输出数据的位置是 标准输出 即显示器
        out.print("hello");
        out.write("hello".getBytes());

        out.close();
        // 我们可以去修改打印流输出的位置
        System.setOut(new PrintStream("E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news1.txt"));
        System.out.println("你好"); // 输出到对应文件
    }
}
