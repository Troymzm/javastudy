package com.advancedOOP.file;

import org.junit.Test;

import java.io.File;

/**
 * @author mzm
 * @version 1.0
 */
public class Directory {
    public static void main(String[] args) {

    }

    @Test
    public void m1() {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()){ // 删除文件或空目录
                System.out.println(file.getName() + "删除成功");
            } else {
                System.out.println(file.getName() + "删除失败");
            }
        } else {
            System.out.println(file.getName() + "不存在");
        }
    }
    @Test
    public void m2() {
        String directoryPath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\test";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(file.getName() + "已经存在");
        } else {
            if (file.mkdir()) {
                System.out.println(file.getName() + "创建成功");
            } else {
                System.out.println(file.getName() + "创建失败");
            }
        }
    }
    @Test
    public void m3() {
        String filePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\test";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()){ // 删除文件或空目录
                System.out.println(file.getName() + "删除成功");
            } else {
                System.out.println(file.getName() + "删除失败");
            }
        } else {
            System.out.println(file.getName() + "不存在");
        }
    }
    @Test
    public void m4() {
        String directoryPath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\test\\a\\b";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(file.getName() + "已经存在");
        } else {
            if (file.mkdirs()) {   // 创建多级目录
                System.out.println(file.getName() + "创建成功");
            } else {
                System.out.println(file.getName() + "创建失败");
            }
        }
    }
}
