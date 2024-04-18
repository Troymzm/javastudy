package com.superOOP.exception_;

/**
 * @author mzm
 * @version 1.0
 */
public class CustomException { // 自定义异常
    public static void main(String[] args) {
        int age = 180;
        // 要求在18 - 120 之间 否则抛出一个自定义异常
        if(!(age >= 18 && age <= 120)) {
            // 我们可以通过构造器设置信息
            throw new AgeException("年龄需要在 18-120 之间");
        }
        System.out.println("你的年龄范围正确");
    }
}
// 自定义异常一般继承 RuntimeException 即把自定义异常做成运行时异常 好处是 可以使用默认的处理机制
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
// throw 手动生成异常