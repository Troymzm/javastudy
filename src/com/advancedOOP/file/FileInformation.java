package com.advancedOOP.file;

import org.junit.Test;

import java.io.File;

/**
 * @author mzm
 * @version 1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    @Test
    // 获取文件信息
    public void info() {
        // 先创建文件对象
        File file = new File("E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news1.txt");

        // 调用相关方法
        System.out.println("文件名: " + file.getName());
        System.out.println("绝对路径: " + file.getAbsolutePath());
        System.out.println("文件父级目录: " + file.getParent());
        System.out.println("文件大小(字节): " + file.length());
        System.out.println("文件是否存在: " + file.exists());
        System.out.println("文件是否是一个文件: " + file.isFile());
        System.out.println("文件是否是一个目录: " + file.isDirectory());
    }
}
