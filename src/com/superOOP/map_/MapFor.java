package com.superOOP.map_;

import java.util.*;

/**
 * @author mzm
 * @version 1.0
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("NO1", "aaron");
        map.put("NO2", "true");
        map.put("NO2", "false");
        map.put("NO3", "false");
        map.put(null,null);
        map.put(null,"abc");

        // 第一组 先取出所有的key 再通过key得到对应的value
        Set keyset = map.keySet();
        // (1) 增强 for
        for (Object key :keyset) {
            System.out.println(key + ": " + map.get(key));
        }
        // (2) 迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + ": " + map.get(key));
        }


        // 第二组 把所有的values取出
        Collection values = map.values();
        // 这里可以使用所有的Collections 使用的遍历方法
        // (1) 增强for
        for (Object object :values) {
            System.out.println(object);
        }
        // (2) 迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        // 第三组 通过EntrySet 取出
        Set entrySet = map.entrySet();
        // (1) 增强 for
        for (Object entry :entrySet) {
            // 将 entry 对象 转换成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + ": " + m.getValue());
        }
        // (2) 迭代器
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();
            // 向下转型
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
}
