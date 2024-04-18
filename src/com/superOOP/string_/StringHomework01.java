package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringHomework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        try {
            str = reverse(str, 0, 3);
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String reverse(String str, int start, int end) {
        // 对输入的参数做一个验证
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char temp = ' ';
        char[] value = str.toCharArray();
        for (int i = start, j = end; i < j; i++, j--) {
            temp = value[i];
            value[i] = value[j];
            value[j] = temp;
        }
        return new String(value);
    }
}
