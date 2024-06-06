package com.advancedOOP.file.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        String directPath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\homework\\temp";
        File file = new File(directPath);
        if (!file.exists()) {
            // 创建目录
            if (file.mkdirs()) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }
        String filePath = directPath + "\\hello.txt";
        file = new File(filePath);
        if (!file.exists()) {
            // 创建文件
            if (file.createNewFile()) {
                System.out.println("创建成功");

                // 如果文件存在使用BufferedWriter写入hello world 你好
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello world 你好");

                bufferedWriter.close();

            } else {
                System.out.println("创建失败");
            }
        }
    }
}
