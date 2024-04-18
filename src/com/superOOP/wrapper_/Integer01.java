package com.superOOP.wrapper_;

/**
 * @author mzm
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        // 演示 int <--> Integer 的装箱与拆箱
        // 手动装箱
        int n1 = 100;
//        Integer integer = new Integer(n1);
//        Integer integer1 = Integer.valueOf(n1);
        // 手动拆箱
        // int i = integer.intValue();

        // 自动装箱
        Integer integer = n1;
        // 自动拆箱
        int n2 = integer;
        // -128-127 直接返回
        Integer n3 = 1;
        Integer n4 = 1;
        System.out.println(n3 == n4);
        Integer n5 = 128;
        Integer n6 = 128;
        System.out.println(n5 == n6);
        Integer n7 = Integer.valueOf(10);
        /*
        1.Integer与new Integer一定不会相等
        2.两个都是非new出来的Integer，如果数在-128到127之间，则是true,否则为false
        3.两个都是new出来的,则为false
        4.int和integer(new或非new)比较，都为true
         */
    }
}
