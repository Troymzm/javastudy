package com.basic.search;

import java.util.Scanner;

public class SeqSearch {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String names[] = { "aa", "bb", "cc", "dd" };
        System.out.println("请输入名字");
        String name = myScanner.next();
        int index = -1;

        // 遍历数组 如果有 提示信息 并退出
        for (int i = 0; i < names.length; i++) {
            // 比较 字符串比较 equals
            if (name.equals(names[i])) {
                System.out.println("已经为您找到" + name);
                System.out.println("下标为" + i);
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有找到" + name);
        }
    }
}
