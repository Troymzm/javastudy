package com.basic.method;

public class MethodExercise02 {
    public static void main(String[] args) {
        Person03 p = new Person03();
        p.name = "aaron";
        p.age = 100;
        MyTools01 tools = new MyTools01();
        Person03 p2 = tools.copyPerson(p);
        // 至此 p 和 p2是Person03对象 但是是两个独立的对象 属性相同
        System.out.println(p.age + p.name);
        System.out.println(p2.age + p2.name);

        // 可以通过 输出对象的hashCode看看对象是否是同一个
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p == p2);
    }
}

class MyTools01 {
    public Person03 copyPerson(Person03 p) {
        Person03 p2 = new Person03();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}

class Person03 {
    String name;
    int age;
}
