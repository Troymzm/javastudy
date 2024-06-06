package com.advancedOOP.file.transformation;

import java.io.*;

/**
 * @author mzm
 * @version 1.0
 * 字节流 -> 字符流
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news5.txt";
        String charSet = "gbk";

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(filePath), charSet);

        outputStreamWriter.write("你好");

        outputStreamWriter.close();
    }
}
