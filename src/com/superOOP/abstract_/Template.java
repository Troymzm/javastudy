package com.superOOP.abstract_;

abstract public class Template { // 抽象类 -- 模板设计模式
    public abstract void job(); // 抽象方法
    public void calculateTime() {
        // 得到开始的时间
        long start = System.currentTimeMillis();
        job(); // 动态绑定
        // 得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("执行时间 " + (end - start));
    }
}
