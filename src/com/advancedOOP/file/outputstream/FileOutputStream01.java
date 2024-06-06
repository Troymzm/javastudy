package com.advancedOOP.file.outputstream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    /*
    演示如何使用FileOutputStream 将数据写到文件中 如果文件不存在则创建该文件
     */
    @Test
    public void writeFile() {
        // 创建FileOutputStream对象
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            // 得到fileOutputStream对象
            fileOutputStream  = new FileOutputStream(filePath);
            // 写入内容后会覆盖原来的内容
            // fileOutputStream  = new FileOutputStream(filePath, true) 追加
            // fileOutputStream  = new FileOutputStream(filePath, true);
            // 写入一个字节
            fileOutputStream.write('a');
            // 写入一个字符串
            String str = "hello";
            // fileOutputStream.write(str.getBytes()); // getBytes()转成字符数组
            // 写指定部分
            fileOutputStream.write(str.getBytes(), 0, str.length());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
