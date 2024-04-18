package com.OOP.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        // 如果使用快捷键alt + r 需要先配置主类 第一次需要鼠标点击 后面就可以用
        Person person = new Person();
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
        Person smith = new Person("smith", 2000, 50000);
        System.out.println(smith.info());

    }
}

class Person {
    // 构造器
    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        // 我们可以将set方法写在构造器中
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String name; // 名字公开
    private int age; // age私有化
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("你设置的名字不对，给默认名字无名人");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // 判断
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，给默认年龄18");
            this.age = 18;
        }
    }

    public double getSalary() {
        // 可以在这里增加权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 写一个方法 返回属性信息
    public String info() {
        return "信息为 name=" + name + "age=" + age + "salary=" + salary;
    }
}
