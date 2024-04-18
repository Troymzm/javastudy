package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        // 增
        s.append(',');
        s.append("aaron");
        s.append(100).append(true).append(10.5);
        System.out.println(s);
        // 删
        /*
        删除索引>= start <end处的字符
        删除 [3,5) 的字符
         */
        s.delete(3,5);
        System.out.println(s);
        // 改
        // 将 [3, 5) 的字符替换为新字符
        s.replace(3, 5, "troy");
        System.out.println(s);
        // 査
        // 查找指定的子串在字符串第一次出现的索引 找不到返回-1
        int index = s.indexOf("aron");
        System.out.println(index);
        int index_1 = s.indexOf("aaron");
        System.out.println(index_1);
        // 插
        // 在索引为2的位置插入fsl 原来索引为2的自动后移
        s.insert(2,"fsl");
        System.out.println(s);
        // 长度
        System.out.println(s.length());
    }
}
