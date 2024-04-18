package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb);
        System.out.println(sb.length());
        // StringBuffer sb2 = new StringBuffer(str); NullPointerException 源码 super(str.length() + 16);
    }
}
