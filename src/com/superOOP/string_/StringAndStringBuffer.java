package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        // String -> StringBuffer
        String str = "hello tom";
        // 方式1 使用构造器 -- 返回的是StringBuffer对象 对str本身无影响
        StringBuffer stringBuffer = new StringBuffer(str);
        // 方式2 使用append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str);

        // StringBuffer -> String
        // 方式1 使用StringBuffer提供的toString方法
        String s = stringBuffer1.toString();
        System.out.println(s);
        // 方式2 使用构造器
        String s1 = new String(stringBuffer);
        System.out.println(s1);
    }
}
