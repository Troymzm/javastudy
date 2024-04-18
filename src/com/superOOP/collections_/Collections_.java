package com.superOOP.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class Collections_ {
    public static void main(String[] args) {
        // 创建ArrayList 集合 用于测试
        List list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        System.out.println(list);
        // reverse 反转
        Collections.reverse(list);
        System.out.println(list);

        // shuffle 随机排序
        Collections.shuffle(list);
        System.out.println(list);

        // sort 自然排序
        Collections.sort(list);
        System.out.println(list);

        // sort(List, Comparator) 自定义排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        });
        System.out.println(list);
        // swap 元素互换
        Collections.swap(list,0, 2);
        System.out.println(list);

        // max 根据自然排序返回最大元素
        System.out.println(Collections.max(list));

        // max(List Comparator) 返回自定义排序最大元素
        System.out.println(Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        }));

        // min 根据自然排序返回最小元素
        System.out.println(Collections.min(list));

        // min(List Comparator) 返回自定义排序最小元素
        System.out.println(Collections.min(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo((String) o1);
            }
        }));

        // frequency 返回指定元素在指定集合中出现次数
        System.out.println(Collections.frequency(list, "aa"));

        // copy 复制
        List list1 = new ArrayList();
        // 为了完成一个完整的拷贝 需要给 list1 赋一些值
        for (int i = 0; i < list.size(); i++) {
            list1.add(null);
        }
        Collections.copy(list1, list); // 后面的复制给前面的
        System.out.println(list1);

        // replaceAll
        Collections.replaceAll(list, "aa", "aaa");
        System.out.println(list);
    }
}
