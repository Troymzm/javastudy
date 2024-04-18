package com.basic.object;

public class ObjectHomework04 {
    public static void main(String[] args) {
        A03 a03 = new A03();
        int arr[] = { 1, 0, 10, 5, 6 };
        int copyArr[] = a03.copyArr(arr);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
        System.out.println(arr.hashCode());
        System.out.println(copyArr.hashCode());
    }
}

class A03 {
    public int[] copyArr(int[] oldArr) {
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++) {
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}
