package com.advancedOOP.file.properties;

import java.io.*;
import java.util.Properties;

/**
 * @author mzm
 * @version 1.0
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        // 创建 Properties 对象
        Properties properties = new Properties();
        // 创建
        properties.setProperty("charset", "utf8");
        properties.setProperty("user", "孟昭明"); // unicode 保存汉字
        properties.setProperty("pwd", "122"); // 没有即创建 有即修改
        properties.setProperty("pwd", "133"); // 没有即创建 有即修改
        // 存储
        properties.store(new FileOutputStream("src\\mysql2.properties"), "hello world");
        System.out.println("保存成功");
        // 修改

    }
}
