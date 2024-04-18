package com.superOOP.collection_;

import java.util.HashSet;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001, "aa");
        Person p2 = new Person(1002, "bb");
        set.add(p1);
        set.add(p2);
        p1.name = "cc"; // p1 的hash值会改变
        set.remove(p1); // 删除不下去 原因是 根据hash值进行删除 hash值已经改变
        System.out.println(set);
        set.add(new Person(1001, "cc")); // 能添加 因为 这个对象对应的hash值未被使用过
        System.out.println(set);
        set.add(new Person(1001,"aa")); // 能添加 因为 虽然这个对象的 hash 值已经被使用 但是使用其hash值的对象与其不同 所以可以成功添加
        System.out.println(set);
    }
}
