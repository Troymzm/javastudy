package com.advancedOOP.file.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        String srcFilePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\hello.txt";
        String destFilePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\outputstream\\hello.txt";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);
            // 定义一个字节数组 提高读取效果
            byte[] buffer = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buffer)) != -1) {
                // 读取到就写入 边读边写
                fileOutputStream.write(buffer, 0, readLen);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // 关闭输入流和输出流 释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
