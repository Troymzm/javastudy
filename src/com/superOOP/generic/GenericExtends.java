package com.superOOP.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");
        // 泛型没有继承性
        // List<Object> list = new ArrayList<String>();

        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA> list3 = new ArrayList<>();
        List<BB> list4 = new ArrayList<>();
        List<CC> list5 = new ArrayList<>();

        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

//        printCollection2(list1);
//        printCollection2(list2);
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        printCollection3(list1);
//        printCollection3(list2);
        printCollection3(list3);
//        printCollection3(list4);
//        printCollection3(list5);


    }
    // 编写几个方法 -- 通配符
    public static void printCollection1(List<?> c) {
        // 任意的泛型类型都可以接受
        for (Object object :c) {
            System.out.println(c);
        }

    }
    public static void printCollection2(List<? extends AA> c) {
        // 上限 可以接受AA及AA的子类
        for (Object object :c) {
            System.out.println(c);
        }
    }
    public static void printCollection3(List<? super AA> c) {
        // 下限 可以接受AA及AA的父类
        for (Object object :c) {
            System.out.println(c);
        }
    }
}
class AA {

}
class BB extends AA {

}
class CC extends BB {

}
