package com.advancedOOP.file.decoratorpattern;

/**
 * @author mzm
 * @version 1.0
 */
public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        bufferedReader_.readFiles(10);

        // 多次读取字符串
        bufferedReader_ = new BufferedReader_(new StringReader_());
        bufferedReader_.readStrings(10);
    }
}
