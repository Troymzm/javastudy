package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringExercise {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a.equals(b));
        System.out.println(a == b);

        String c = new String("abc");
        String d = new String("abc");
        System.out.println(c.equals(d));
        System.out.println(c == d);
        System.out.println(a.equals(c));
        System.out.println(a == c);
        // 当调用intern方法时 如果池已经包含了一个等于此String对象的字符串 则返回池中的字符串 否则将此 String 对象添加到池中 并返回此 String 对象的引用
        System.out.println(a == c.intern());
        System.out.println(c == c.intern());
        // c.intern() 最终返回常量池的地址
    }
}
