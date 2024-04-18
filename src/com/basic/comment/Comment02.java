package com.basic.comment;// 文档注释
/**
 * @author 孟昭明
 * @version 1.0
 */
public class Comment02 {
    public static void main(String[] args) {
        /*
         * 示意 -- 多行注释
         * 下面代码完成 两个数相加
         * 定义变量
         */
        int n1 = 10;
        int n2 = 30;
        // 求和
        int sum = n1 + n2;
        // 输出结果
        System.out.println("结果=" + sum);
    }
}
// 文档注释应用 javadoc -d -xx -yy 文件名.java
