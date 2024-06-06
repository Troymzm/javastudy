package com.advancedOOP.file.decoratorpattern;

/**
 * @author mzm
 * @version 1.0
 */
public class BufferedReader_ extends Reader_ {
    // 模拟处理流
    private Reader_ reader_; // 属性是 Reader_ 类型

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    // 拓展方法 -- 多次处理文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    // 拓展方法 -- 多次处理字符串
    public void readStrings(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
