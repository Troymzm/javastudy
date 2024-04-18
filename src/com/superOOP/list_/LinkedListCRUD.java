package com.superOOP.list_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author mzm
 * @version 1.0
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // 增删效率高 改査效率低
        // 增
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);

        // 删
        linkedList.remove();
        linkedList.remove(2);
        System.out.println(linkedList);

        // 改
        linkedList.set(1, 999);
        System.out.println(linkedList);

        // 査
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.indexOf(5));

        // 遍历
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        for (Object object :linkedList) {
            System.out.println(object);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
