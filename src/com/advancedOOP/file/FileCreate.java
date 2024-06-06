package com.advancedOOP.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author mzm
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    // 方式一 new File(String pathname)
    @Test
    public void create01() {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    // 方式二 new file(File parent, String child) 根据父目录文件 + 子路径
    public void create02() {
        File parentFile = new File("E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    // 方法三 new File(String parent, String child)
    public void create03() {
        String parentPath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\";
        String fileName = "news3.txt";

        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
