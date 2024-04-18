package com.basic.method;

public class MethodExercise01 {
    public static void main(String[] args) {
        AA01 a = new AA01();
        if (a.isOdd(1)) {
            System.out.println("是奇数");
        } else {
            System.out.println("是偶数");
        }
        a.print(3, 5, '#');
    }
}

class AA01 {
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public void print(int rows, int cols, char str) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}