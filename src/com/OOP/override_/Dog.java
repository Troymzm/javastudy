package com.OOP.override_;

public class Dog extends Animal {
    // Dog 的 cry 方法 重写了 Animal 的 cry
    public void cry() {
        System.out.println("小狗叫");
    }

    // 子类方法的返回类型和父类方法返回类型一样 或者是父类返回类型的子类  比如父类返回Object子类返回String 不是则报错
    public String m1() {
        return null;
    }

    public String m2() {
        return null;
    }
    public BBB m3() {
        return null;
    }

    // 子类方法不能缩小父类方法访问权限
    public void eat() {

    }
}
class AAA {

}
class BBB extends AAA {

}
