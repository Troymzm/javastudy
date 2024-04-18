package com.superOOP.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author mzm
 * @version 1.0
 */
public class MapSource {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("NO1", "aaron");
        map.put("NO2", "true");
        /*
        1. k-v 最后是 HashMap$Node node = newNode(hash, key, value, null)
        2. k-v 为了方便程序员遍历 还会创建 EntrySet 集合 该集合存放的元素类型 Entry 而一个 Entry 对象就有 k,v
        3. 在 entrySet 中 定义的类型是 Map.Entry 实际上存放的还是 HashMap$Node 这是因为 HashMap$Node implements Map.Entry
        4. 当把 HashMap$Node 对象 存放到 entrySet 就非常方便遍历 因为 Map.Entry 提供了重要方法 getKey getValue
         */
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object object :set) {
            System.out.println(object.getClass());
            // 为了从 HashMap$Node 取出 k-v
            /*
            1. 先做一个向下转型
             */
            Map.Entry entry = (Map.Entry) object;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());
    }
}
