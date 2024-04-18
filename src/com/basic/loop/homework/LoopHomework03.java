package com.basic.loop.homework;

public class LoopHomework03 {
    public static void main(String[] args) {
        char alpha = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (alpha + i));
        }
        System.out.println();
        for (int j = 0; j < 26; j++) {
            System.out.print((char) (alpha + j - 32));
        }
    }
}
