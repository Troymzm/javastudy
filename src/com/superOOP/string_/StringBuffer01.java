package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        // StringBuffer 的直接父类 AbstractStringBuilder 实现了Serializable 可以串行化
        // 在其父类中 AbstractStringBuilder 有属性 char[] value 不是final 存放 字符串内容 存放在堆中
        // StringBuffer 是一个final类
        // String 保存的是字符串常量 里面的值不能更改
        // StringBuffer 保存的是字符串变量 里面的值可以修改 不用每次更新地址

        // StringBuffer 构造器
        // 创建1个大小为16的 char[] 用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        // 通过构造器指定char[] 大小
        StringBuffer stringBuffer_1 = new StringBuffer(20);

        // 通过给一个String 创建StringBuffer char[] 大小为字符串大小
        StringBuffer stringBuffer_2 = new StringBuffer("hello");
    }
}
