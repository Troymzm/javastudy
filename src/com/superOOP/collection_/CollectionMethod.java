package com.superOOP.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        // add 添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
        // remove 删除指定元素
        list.remove(0); // 删除第一个元素
        list.remove(true); // 指定删除某个元素
        System.out.println(list);
        // contains 查找元素是否存在
        System.out.println(list.contains("jack"));
        // size 获取元素个数
        System.out.println(list.size());
        // isEmpty 判断是否为空
        System.out.println(list.isEmpty());
        // clear 清空
        list.clear();
        System.out.println(list);
        // addAll 添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("Cristinado");
        list.addAll(arrayList);
        System.out.println(list);
        // containsAll 查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));
        // removeAll 删除多个元素
        list.removeAll(arrayList);
        System.out.println(list);
    }
}
