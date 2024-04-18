package com.superOOP.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author mzm
 * @version 1.0
 */
public class CollectionFor {
    @SuppressWarnings({"unchecked", "MismatchedQueryAndUpdateOfCollection"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 34.6));
        // 使用增强for
        for(Object book :col) {
            System.out.println(book);
        }
        // 增强for也可以直接在数组中使用
        // 底层使用迭代器 iterator 可以理解成简化版的迭代器遍历
        // 快捷方式 I
        for (Object object :col) {
            System.out.println(object);
        }

    }
}
