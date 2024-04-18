package com.OOP.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        // instanceof 判断对象的运行类型是否为..类型或..类型的子类型
        AA aa = new BB(); // aa 编译类型 AA 运行类型 BB
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);

        Object object = new Object();
        System.out.println(object instanceof AA);

        String str = "hello";
        // System.out.println(str instanceof AA); 在 Java 中，instanceof 运算符用于检查对象是否是特定类的实例或其子类的实例。但是，Java 中的 instanceof 运算符不能用于检查一个对象是否是与其无继承关系的类的实例，否则会导致编译错误
        System.out.println(str instanceof Object);
    }
}
class AA {}
class BB extends AA {}
