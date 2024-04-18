package com.basic.loop.break_;

public class BreakDetail {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        label1: for (int j = 0; j < 4; j++) {
            label2: for (int i = 0; i < 4; i++) {
                if (i == 2) {
                    break label1; // 不写默认退出最内层循环label2
                }
                System.out.println(i);
            }
        }
    }
}
