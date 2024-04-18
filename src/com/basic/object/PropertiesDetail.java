package com.basic.object;

public class PropertiesDetail {
    public static void main(String[] args) {
        // 创建Person对象
        // p1是对象名(对象引用)
        // new Person1() 创建的对象空间(数据)才是真正的对象
        // 对象的属性默认值 遵守数组规则
        Person1 p1 = new Person1();
        // 或 Person p1; 先声明 p1 = new Person(); 再创建
        System.out.println(p1.age + "\t" + p1.name + "\t" + p1.sal + "\t" + p1.isPass);
    }
}

class Person1 {
    int age;
    String name;
    double sal;
    boolean isPass;
}