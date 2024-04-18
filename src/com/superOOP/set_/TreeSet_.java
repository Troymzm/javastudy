package com.superOOP.set_;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author mzm
 * @version 1.0
 */
public class TreeSet_ {
    public static void main(String[] args) {
        // 当我们使用无参构造器创建 TreeSet 时 仍然是无序的
        TreeSet treeSet = new TreeSet();
        // 添加数据
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        System.out.println(treeSet);
        // 希望添加的元素 按照字符串大小来排序
        // 使用 TreeSet 提供的一个构造器 可以传入一个比较器
        TreeSet treeSet1 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 调用 String 的 compareTo 进行字符串比较
                return ((String) o1).compareTo((String) o2);
            }
        });
        // 添加数据
        treeSet1.add("jack");
        treeSet1.add("tom");
        treeSet1.add("sp");
        treeSet1.add("a");
        System.out.println(treeSet1);

        TreeSet treeSet2 = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 从小到大
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        // 添加数据
        treeSet2.add("jack");
        treeSet2.add("tom");
        treeSet2.add("sp");
        treeSet2.add("a");
        treeSet2.add("abc"); // 认为长度一样就认为是同一元素 数据无法加入
        System.out.println(treeSet2);
    }
}
