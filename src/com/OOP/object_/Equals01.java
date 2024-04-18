package com.OOP.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        // == 判断引用对象的地址
        System.out.println(a == c);
        System.out.println(b == c);
        B bObj = a;
        System.out.println(bObj == a);
        System.out.println("hello".equals("abc"));
        Integer integer1 = Integer.valueOf(1000);
        Integer integer2 = Integer.valueOf(1000);
        System.out.println(integer1 == integer2);
        // equals判断值是否相等
        System.out.println(integer1.equals(integer2));

        String str1 = new String("aaa");
        String str2 = new String("aaa");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}

class A extends B {

}
class B {

}
