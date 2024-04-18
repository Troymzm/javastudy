package com.superOOP.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class ListFor {
    public static void main(String[] args) {
        List list = new ArrayList(); // 也可以为 Vector 或 LinkedList
        list.add("new");
        list.add("bed");

        // 遍历
        // 1. 迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        // 2. 增强for
        for (Object object :list) {
            System.out.println(object);
        }
        // 3. 普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
