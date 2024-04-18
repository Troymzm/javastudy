package com.basic.yanghui;

public class YangHui {
    public static void main(String[] args) {
        int rows = 10;
        int Yanghui[][] = new int[rows][];
        for (int i = 0; i < rows; i++) {
            Yanghui[i] = new int[i + 1];
        }
        Yanghui[0][0] = 1;
        Yanghui[1][0] = 1;
        Yanghui[1][1] = 1;
        for (int i = 2; i < rows; i++) {
            Yanghui[i][0] = 1;
            Yanghui[i][i] = 1;
            for (int j = 1; j < Yanghui[i].length - 1; j++) {
                Yanghui[i][j] = Yanghui[i - 1][j] + Yanghui[i - 1][j - 1];
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
