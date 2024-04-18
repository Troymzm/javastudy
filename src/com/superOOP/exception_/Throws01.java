package com.superOOP.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author mzm
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2() throws FileNotFoundException,Exception { // 可以是发生的异常 也可以是其父类 throws关键字后 可以是异常列表 即可以抛出多个异常
        // 创建一个文件流对象 FileNotFoundException 编译异常
        // 使用throws 抛出异常 让调用f2方法的调用者(方法) 处理
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
