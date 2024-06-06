package com.advancedOOP.file.reader;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class FileReader_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {  // 单个字符读取
        // 创建FileReader对象
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news2.txt";
        FileReader fileReader = null;
        int data = 0;
        try {
            fileReader = new FileReader(filePath);
            // 使用read循环读取
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Test
    public void readFile02() {  // 字符数组读取
        // 创建FileReader对象
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news2.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buffer = new char[8];
        try {
            fileReader = new FileReader(filePath);
            // 使用read(buffer)循环读取
            while ((readLen = fileReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
