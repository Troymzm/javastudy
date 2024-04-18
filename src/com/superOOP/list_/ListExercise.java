package com.superOOP.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("hello" + i);
        }
        list.add(1, "aaron");
        System.out.println(list.get(4));
        list.remove(5);
        list.set(6, "fengshuolan");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
