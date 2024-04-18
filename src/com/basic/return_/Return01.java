package com.basic.return_;

public class Return01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.err.println("你好");
                return; // 跳出方法 跳出main方法为退出程序
            }
            System.out.println("加油");
        }
        System.out.println("com.basic.hello_.Hello world");
    }

}
