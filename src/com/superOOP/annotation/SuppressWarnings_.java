package com.superOOP.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class SuppressWarnings_ {
    // @SuppressWarnings 抑制警告信息 作用范围 和 放置位置相关
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        int i;
        System.out.println(list.get(1));
    }
}
