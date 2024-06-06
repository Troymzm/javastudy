package com.advancedOOP.file.inputstream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 * 演示FileInputStream的使用(字节输入流 文件->程序)
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    /*
    单个字节读取 效率低 -> 使用byte
     */
    @Test
    public void readFile01() {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            // 创建FileInputStream用于读取文件
            fileInputStream = new FileInputStream(filePath);
            while ((readData = fileInputStream.read()) != -1) { // 逐个读取
                System.out.print((char)readData);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭文件流 释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*
    字节数组读入
    */
    @Test
    public void readFile02() {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\hello.txt";
        // 字节数组
        byte[] buffer = new byte[8]; // 一次读8个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            // 创建FileInputStream用于读取文件
            fileInputStream = new FileInputStream(filePath);
            // 读取正常返回实际读取的字节数
            while ((readLen = fileInputStream.read(buffer)) != -1) { // 逐个读取
                System.out.print(new String(buffer, 0, readLen));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 关闭文件流 释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
