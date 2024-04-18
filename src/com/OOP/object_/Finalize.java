package com.OOP.object_;

public class Finalize {
    public static void main(String[] args) {
        Car amr = new Car("AMR");
        amr = null; // 对象空间就是一个垃圾 垃圾回收器就会回收或销毁对象 在销毁对象前 会调用该对象的finalize方法 程序员就可以在 finalize 中 写自己的业务逻辑代码 比如释放资源 数据库连接 或者打开文件
    }
}
class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    // finalize 已经弃用
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
}
