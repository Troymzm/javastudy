package com.superOOP.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
    }
}
// 希望在程序运行中只能创建一个cat对象 单例模式--懒汉式 只有用户使用gatInstance时才返回对象 下面再次调用时 会返回上次创建的对象 从而保证单例
class Cat {
    private String name;
    public static int n1 = 999;
    private static Cat cat;
    /*
    步骤
    1. 构造器私有化
    2. 定义一个static静态属性对象
    3. 提供一个public的static方法 可以返回一个Cat对象
     */
    private Cat(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Cat getInstance() {
        if (cat == null) {
            // 如果还没有创建对象
            cat = new Cat("aaron");
        }
        return cat;
    }
}