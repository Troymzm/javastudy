package com.advancedOOP.file.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\writer\\test_buffered.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));

        bufferedWriter.write("hello world");
        bufferedWriter.newLine(); // 插入一个和系统相关的换行符
        bufferedWriter.write("hello world");
        bufferedWriter.newLine();

        // 关闭外层流即可
        bufferedWriter.close();
    }
}
