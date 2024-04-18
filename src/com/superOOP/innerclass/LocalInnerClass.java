package com.superOOP.innerclass;

// 局部内部类
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 {
    private int n1 = 100;
    private void m2() {

    }
    public void m1() {
        // 局部内部类是定义在外部类的局部位置 通常在方法
        final class Inner02 {
            private int n1 = 800;
            // 局部内部类
            // 可以直接访问外部类的所有成员 包含私有的
            // 不能添加访问修饰符 但是可以使用 final 修饰
            // 作用域 仅仅定义在它的方法或代码块中
            public void f1() {
                // 局部内部类可以直接访问外部类的成员
                System.out.println(n1);
                System.out.println(Outer02.this.n1);
                m2();
            }
        }
        // 外部类在方法中 可以创建内部类对象 然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
        // 如果外部类和局部内部类的成员重名 默认遵循就近原则 如果想要访问外部类的成员 使用 外部类名.this.成员 去访问
        // 外部类名.this 本质是外部类的对象
    }
}