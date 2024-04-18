package com.superOOP.exception_;

/**
 * @author mzm
 * @version 1.0
 */
public class NumberFormatException_ { // 数字格式不正确异常
    public static void main(String[] args) {
        String name = "aaron";
        // 将String转换成int
        int num = Integer.parseInt(name);
        System.out.println(num);
    }
}
