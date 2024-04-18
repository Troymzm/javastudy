package com.basic.operator;

public class LogicOperator01 {
    public static void main(String[] args) {
        // &&(短路与) 和 &(逻辑与)
        int age = 50;
        if(age > 20 && age < 90) {
            System.out.println("ok100");
        }
        if(age > 20 & age < 90) {
            System.out.println("ok200");
        }

        // 区别 短路与&&如果第一个条件为false后面的条件不再判断 逻辑与&如果第一个条件为false后面的条件仍然会判断
        int a1 = 4;
        int b1 = 9;
        if(a1 < 1 && ++b1 < 50) {
            System.out.println("ok300");
        }
        System.out.println(a1);
        System.out.println(b1);

        int a2 = 4;
        int b2 = 9;
        if(a2 < 1 & ++b2 < 50) {
            System.out.println("ok400");
        }
        System.out.println(a2);
        System.out.println(b2);
    }
}
