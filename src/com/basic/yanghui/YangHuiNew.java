package com.basic.yanghui;

public class YangHuiNew {
    public static void main(String[] args) {
        int rows = 10;
        int Yanghui[][] = new int[rows][];
        for (int i = 0; i < rows; i++) {
            Yanghui[i] = new int[i + 1];
            for (int j = 0; j < Yanghui[i].length; j++) {
                if (j == 0 || j == Yanghui[i].length - 1) {
                    Yanghui[i][j] = 1;
                } else {
                    Yanghui[i][j] = Yanghui[i - 1][j] + Yanghui[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < Yanghui.length; i++) {
            for (int j = 0; j < Yanghui[i].length; j++) {
                System.out.print(Yanghui[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
