package com.basic.loop.continue_;

public class ContinueDetail {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        label1: for (int j = 0; j < 4; j++) {
            label2: for (int i = 0; i < 4; i++) {
                if (i == 2) {
                    continue label1; // 不写默认continue最内层循环label2
                }
                System.out.println(i);
            }
        }
    }
}