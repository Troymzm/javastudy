package com.superOOP.collection_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("jack", 650);
        map.put("tom", 1200);
        map.put("smith", 2900);

        map.put("jack", 2600);

        Set set = map.keySet();

        for (Object key :set) {
            map.put(key, (Integer)(map.get(key)) + 100);
        }
        Set set1 = map.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Object entry =  iterator.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + ": " + m.getValue());
        }
    }
}
