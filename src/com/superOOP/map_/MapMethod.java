package com.superOOP.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mzm
 * @version 1.0
 */
public class MapMethod {
    public static void main(String[] args) {
        // 演示map接口常用方法
        // 增
        Map map = new HashMap();
        map.put("aa", new Book("aaBook", 10));
        map.put("aa", "bb");
        map.put("cc", new Book("ccBook", 10));
        map.put(null,null);
        System.out.println(map);

        // 删 remove 根据键删除映射关系
        map.remove(null);
        System.out.println(map);

        // get 根据键获取值
        Object val = map.get("aa");
        System.out.println(val);

        // size 获取元素个数
        System.out.println(map.size());

        // isEmpty 判断个数是否为0
        System.out.println(map.isEmpty());

        // containsKey 查找键是否存在
        System.out.println(map.containsKey("aa"));

        // clear 清空
        map.clear();
        System.out.println(map);
    }
}
class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
