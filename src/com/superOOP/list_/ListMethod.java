package com.superOOP.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaron");
        list.add("mary");
        System.out.println(list);
        // void add(int index, Object ele) 从index位置插入ele元素 默认添加到最后
        list.add(1,"kitty");
        System.out.println(list);
        // boolean addall(int index, Collection eles) 从index位置开始讲eles中的所有元素添加进来
        List list1 = new ArrayList();
        list1.add("jack");
        list1.add("tom");
        list.addAll(1, list1);
        System.out.println(list);
        // indexOf
        System.out.println(list.indexOf("tom"));
        // lastIndexOf
        System.out.println(list.lastIndexOf("tom"));
        // remove 移除指定index位置的元素
        list.remove(0);
        System.out.println(list);
        // set 设置指定index 位置的元素为eles 相当于替换
        // Object set(int index, Collection eles)
        list.set(1, list1);
        System.out.println(list);
        // List sublist(int fromIndex, int toIndex): 返回从fromIndex到toIndex位置的子集合
        // 左闭右开
        System.out.println(list.subList(1, 3));
    }
}
