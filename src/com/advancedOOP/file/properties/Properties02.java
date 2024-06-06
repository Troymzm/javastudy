package com.advancedOOP.file.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author mzm
 * @version 1.0
 */
public class Properties02 {
    public static void main(String[] args) throws IOException {
        // 使用 Properties 类读取mysql.properties

        // 创建 Properties 对象
        Properties properties = new Properties();
        // 加载指定配置文件
        properties.load(new FileReader("src\\mysql.properties"));
        // 显示到控制台
        properties.list(System.out);
        // 根据一个键获取对应的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名: " + user);
        System.out.println("密码: " + pwd);
    }
}
