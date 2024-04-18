package com.basic.method;

public class Method01 {
    public static void main(String[] args) {
        /*
         * 方法使用
         * 1. 方法写好后如果不去调用不会生效
         * 2. 先创建对象 然后调用方法即可
         */
        Person02 p1 = new Person02();
        p1.speak();
        p1.cal01();
        p1.cal02(100);
        int returnRes = p1.getSum(10, 20);
        System.out.println(returnRes);
    }
}

class Person02 {
    String name;
    int age;

    /*
     * 1. public 表示方法是公开
     * 2. void 表示方法没有返回值
     * 3. speak() speak 是方法名 () 形参列表
     * 4. {} 方法体 可以写我们要执行的代码
     */
    public void speak() {
        System.out.println("我是一个好人");
    }

    public void cal01() {
        int res = 0;
        for (int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println(res);
    }

    public void cal02(int n) { // 形参列表
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
    }

    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res; // 返回值
    }
}
