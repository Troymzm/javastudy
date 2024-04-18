package com.superOOP.interface_;

public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey aaron = new LittleMonkey("aaron");
        aaron.climbing();
        aaron.swimming();
        aaron.flying();
    }
}
// 接口
interface Fishable {
    void swimming();
}
interface Birdable {
    void flying();
}

// 猴子
class Monkey {
    private String name;
    public void climbing() {
        System.out.println(name + "会爬树");
    }

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// 继承
class LittleMonkey extends Monkey implements Fishable, Birdable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "会游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName() + "会飞翔");
    }
}
// 当子类继承了父类 就自动拥有了父类的功能 如果子类需要扩展功能 可以通过实现接口的方式拓展 可以理解为 实现接口 是 对但几次机制的一种补充