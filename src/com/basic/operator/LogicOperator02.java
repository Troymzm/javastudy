package com.basic.operator;

public class LogicOperator02 {
    public static void main(String[] args) {
        // ||(短路或) 和 |(逻辑或)
        int age = 50;
        if(age > 20 || age < 30) {
            System.out.println("ok100");
        }
        if(age > 20 | age < 30) {
            System.out.println("ok200");
        }

        // 区别 短路或||如果第一个条件为true后面的条件不再判断 逻辑或|如果第一个条件为true后面的条件仍然会判断
        int a1 = 4;
        int b1 = 9;
        if(a1 > 1 || ++b1 > 4) {
            System.out.println("ok300");
        }
        System.out.println(a1);
        System.out.println(b1);

        int a2 = 4;
        int b2 = 9;
        if(a2 > 1 | ++b2 < 4) {
            System.out.println("ok400");
        }
        System.out.println(a2);
        System.out.println(b2);
    
    }
}
