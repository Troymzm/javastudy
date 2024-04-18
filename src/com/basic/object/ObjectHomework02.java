package com.basic.object;

public class ObjectHomework02 {
    public static void main(String[] args) {
        A02 a02 = new A02();
        String[] strs = { "aa", "bb", "cc", "dd" };
        int index = a02.find("hsp", strs);
        System.out.println(index);
    }
}

class A02 {
    public int find(String findstr, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (findstr.equals(strs[i])) {
                return i;
            }
        }

        return -1;
    }
}