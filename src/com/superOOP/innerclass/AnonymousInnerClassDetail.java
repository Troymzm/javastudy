package com.superOOP.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05 {
    private int n1 = 99;
    public void f1() {
        // 创建一个基于类的匿名内部类
        Person person = new Person(){
            // 可以直接访问外部类的所有成员 包括私有的 不能添加访问修饰符 作用域为方法或代码块中
            // 如果外部类和匿名内部类的成员重名 默认遵循就近原则 如果想要访问外部类的成员 使用 外部类名.this.成员 去访问
            private int n1 = 88;
            @Override
            public void hi() {
                System.out.println("匿名内部类重写hi方法" + n1);
                System.out.println(Outer05.this.n1);
            }
        };
        person.hi();
        // 也可以直接调用
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写hi方法 hhh");
            }

            @Override
            public void ok(String string) {
                super.ok(string);
            }
        }.ok("Great");
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String string) {
        System.out.println(string);
    }
}