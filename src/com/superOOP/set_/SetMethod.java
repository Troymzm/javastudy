package com.superOOP.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author mzm
 * @version 1.0
 */
public class SetMethod {
    public static void main(String[] args) {
        // 以 Set 接口的一个实现类 HashSet 为例
        // Set 接口对象不能存放重复的元素
        // 可以添加1个null
        // Set 接口对象存放数据是无序的 即添加的顺序和取出的顺序不一致 取出的顺序是固定的
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);
        set.remove("jack");
        System.out.println(set);

        // 遍历
        // 迭代器
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        // 增强for
        for (Object object :set) {
            System.out.println(object);
        }
    }
}
