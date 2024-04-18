package com.basic.loop.for_;

public class ForDetal {
    public static void main(String[] args) {
        // for(; 循环控制条件; ) 初始化和变量迭代可以写到其他地方 但是分号不能省略
        int i = 1; // 循环变量初始化
        for (; i <= 10;) {
            System.out.println(1);
            i++;
        }
        System.out.println(i);

        // for(;;)死循环
        // 循环初始化可以有多条初始化语句
        int count = 3;
        for (int i1 = 0, j = 0; i1 < count; i1++, j += 2) {
            System.out.println("i = " + i1 + "j = " + j);
        }
    }
}
