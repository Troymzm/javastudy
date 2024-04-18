package com.OOP.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        // 向上转型 父类的引用指向子类的对象
        // 编译类型看左面，运行类型看右面
        Animal animal = new Cat();
        // 可以调用父类中所有成员(需要遵守访问权限) 但是不能调用子类特有的成员 因为编译阶段能调用哪些成员是由编译类型决定 最终运行效果看子类的具体体现
        // animal.catchFish 报错
        animal.eat();
        animal.run();
        animal.sleep();
        animal.show();
        // 多态的向下转型 编译类型 Cat 运行类型 Cat
        Cat cat = (Cat) animal;
        cat.catchFish();
        // 父类的引用必须指向的是当前目标类型的对象
    }
}
