package com.superOOP.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzm
 * @version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        // 以 HashMap 为例
        // Map 与 Collection 是并列存在的 用于保存具有映射关系的数据 Key-Value (双列元素)
        Map map = new HashMap();
        map.put("NO1", "aaron");
        map.put("NO2", "true");
        map.put("NO2", "false");
        map.put("NO3", "false");
        map.put(null,null);
        map.put(null,"abc");
        System.out.println(map);
        // Map 中的 key 和 value 可以是任何引用类型的数据 会封装到HashMap$Node对象中
        // Map 中的 key 不允许重复 原因和 Hashset 一样 当有相同的key时 相当于替换 value 允许重复
        // 常用 String 类 作为 key
        // key 和 value 之间存在一一对应关系 通过指定的 key 总能找到对应的 value
        // 通过 get 方法 传入 key 得到对应 value
        System.out.println(map.get("NO1"));

    }
}
