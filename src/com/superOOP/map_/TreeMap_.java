package com.superOOP.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author mzm
 * @version 1.0
 */
public class TreeMap_ {
    public static void main(String[] args) {
        // 使用默认构造器 -- 无序的
        TreeMap treeMap = new TreeMap();
        treeMap.put("aaron", "AlA");
        treeMap.put("bub", "BAB");
        treeMap.put("case", "FCC");
        treeMap.put("abase", "ADD");

        System.out.println(treeMap);
        // 按照key的字符串大小排序
        TreeMap treeMap1 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        treeMap1.put("aaron", "AlA");
        treeMap1.put("bub", "BAB");
        treeMap1.put("case", "FCC");
        treeMap1.put("abase", "ADD");
        System.out.println(treeMap1);

        // 按照key的字符串长度排序
        TreeMap treeMap2 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap2.put("aaron", "AlA");
        treeMap2.put("bub", "BAB");
        treeMap2.put("case", "FCC");
        treeMap2.put("abase", "ADD");
        System.out.println(treeMap2);
    }
}
