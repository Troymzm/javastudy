package com.advancedOOP.file.transformation;

import java.io.*;

/**
 * @author mzm
 * @version 1.0
 * 演示使用转换流 字节流 -> 字符流
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news4.txt";
        // FileInputStream转成InputStreamReader 指定编码 gbk 使用 BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "gbk"));
        String string = bufferedReader.readLine();
        System.out.println(string);

        bufferedReader.close(); // 关闭外层流
    }
}
