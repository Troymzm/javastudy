package com.basic.method;

public class Method02 {
    public static void main(String[] args) {
        int arr[][] = { { 0, 0, 1 }, { 1, 1, 1 }, { 1, 1, 3 } };
        // 使用方法完成输出
        MyTools tool = new MyTools();
        tool.printArr(arr);
    }
}

// 把输出的功能写到一个类的方法中 然后调用该方法即可
/**
 * MyTools
 */
class MyTools {
    // 方法 接收一个二维数组
    public void printArr(int[][] map) {
        // 对传入的map数组进行遍历输出
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
