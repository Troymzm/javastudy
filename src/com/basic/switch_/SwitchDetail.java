package com.basic.switch_;

public class SwitchDetail {
    public static void main(String[] args) {
        // 表达式数据类型 应和case后的常量类型一致
        // 或者是可以自动转成可比较的类型 比如输入的是字符 而常量是int
        // switch(表达式)中表达式的返回值必须是 byte short int char enum(枚举)
        // case子句的值必须是常量或者常量表达式 而不能是变量
        // default 子句是可选的 当没有匹配的case时 执行default
        // 如果没有default子句 有没有匹配任何常量 则没有任何输出
        // break 语句用来执行完一个case分支后使程序跳出switch语句块
        // 如果没有写break 程序会顺序执行到switch结尾 除非遇到break
        char c = 'a';
        switch (c) {
            case 'a':
                System.out.println("ok1");
                break;
            case 2:
                System.out.println("ok2");
                break;

            default:
                System.out.println("ok3");
                break;
        }
    }
}
