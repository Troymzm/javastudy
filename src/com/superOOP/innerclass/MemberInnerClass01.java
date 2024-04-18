package com.superOOP.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        // 第一种方式--外部其他类使用成员内部类的方式
        Outer08.Inner08 inner08 = outer08.new Inner08();
        // 相当于把new Inner08()当成outer08成员

        // 第二种方式 在外部类中编写一个方法返回成员内部类的对象
        Outer08.Inner08 inner08_1 = outer08.getInner08Instance();
    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    public class Inner08 { // 成员内部类 -- 定义在外部类的成员位置上 可以添加任意访问修饰符
        private double sal = 99.8;
        private int n1 = 25;
        public void say() {
            // 可以直接访问外部类的所有属性 包括私有的
            System.out.println(n1);
            System.out.println(Outer08.this.n1);
            System.out.println(name);
        }
    }
    public void t1() { // 调用成员内部类
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
    public Inner08 getInner08Instance() {
        return new Inner08();
    }
}