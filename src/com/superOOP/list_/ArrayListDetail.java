package com.superOOP.list_;

import java.util.ArrayList;

/**
 * @author mzm
 * @version 1.0
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        // 可以加入多个null
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        arrayList.add(null);
        System.out.println(arrayList);
        // 基本等同于Vector 多线程考虑Vector
        // 存在线程安全问题 没有 synchronized
    }
}
