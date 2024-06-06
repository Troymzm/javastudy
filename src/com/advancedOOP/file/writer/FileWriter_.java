package com.advancedOOP.file.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\writer\\test.txt";
        // 创建FileWriter对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c', 'd'};
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('H');
            fileWriter.write(chars);
            fileWriter.write("孟昭明".toCharArray(), 0, 3);
            fileWriter.write("你好");
            fileWriter.write("上海自来水", 0, 2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 一定要关闭流或者flush才能真正写入文件
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
