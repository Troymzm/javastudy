// package的作用是声明当前类所在的包 需要放在类的最上面 一个类中最多只有一句package
package com.OOP.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class PkgDetail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, -1, 1};
        Arrays.sort(arr);
    }
}
