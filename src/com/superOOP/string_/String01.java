package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        // 1. String 对象用于保存字符串 也就是一组字符序列
        // 2. "jack" 字符串常量 双引号括起的字符序列
        // 3. 字符串的字符采用Unicode字符编码 一个字符占两个字节
        // 4. String类有很多的构造器 构造器的重载
//        String s1 = new String();
//        String s2 = new String(String original);
//        String s3 = new String(char[] a);
//        String s4 = new String(char[] a, int startIndex, int count);
//        String s5 = new String(byte[] b);
        // 5. String 类实现了接口 Serializable [可以串行化：可以在网络传输] Comparable [可以进行比较]
        // 6. String 是一个final类
        // 7. String 有属性 private final char value[]; 用于存放字符串内容
        // 8. value 是一个 final 类型 不可以修改 即value不能指向新的地址 但是单个字符内容是可以变化的
        String name = "jack";
        name = "tom";
        final char[] value= {'a', 'b', 'c'};
        char[] value2= {'e', 'f', 'g'};
        value[0] = 'h';
//        value = value2;
        // 不允许指向新的指向空间

        // 先创建一个 StringBuilder sb = StringBuilder();
        // 执行 sb.append("hello");
        // 执行 sb.append("world");
        // 调用 String c = sb.toString(); -- 底层是new
        // 最后其实是 c 指向堆中的对象(String) value[] -> "helloabc"

        // 常量相加 看的是池 变量相加 看的是堆

        String a = "hello";
        String b = "world";
        String c = a + b;
        String d = "helloworld";
        String e = "hello" + "world";
        System.out.println(c == d);
        System.out.println(d == e);
    }
    // String str = "aa"  -- 指向方法区中常量池
    // String str = new String("aa") -- 指向堆
}
