package com.superOOP.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author mzm
 * @version 1.0
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        // 维护 数组 + 双向链表 确保加入顺序与取出顺序一致
        Set set = new LinkedHashSet();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add(new String("ccc"));
        System.out.println(set);
    }
}
