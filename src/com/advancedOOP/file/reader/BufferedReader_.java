package com.advancedOOP.file.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news2.txt";
        // 创建 BufferedReader 对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        // 读取
        String line; // 按行读取 文件读完返回null
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 关闭流 -- 只需要关闭外层流即可
        bufferedReader.close();
    }
}
