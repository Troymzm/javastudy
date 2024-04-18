package com.superOOP.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class List_ {
    public static void main(String[] args) {
        // List 集合类中的元素有序 即添加顺序和取出顺序一致 且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("mary");
        list.add("jack");
        System.out.println(list);
        // List 集合中的每个元素都有其对应的顺序索引 从0开始
        System.out.println(list.get(2));
    }
}
