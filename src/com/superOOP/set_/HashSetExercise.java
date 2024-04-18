package com.superOOP.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author mzm
 * @version 1.0
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("aa", 18));
        hashSet.add(new Employee("bb", 19));
        hashSet.add(new Employee("cc", 20));
        System.out.println(hashSet.add(new Employee("aa", 18)));

        for (Object object :hashSet) {
            System.out.println(object);
        }

    }
}
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName());
    }

    // 重写 hashCode 如果 name 和 age 值相同 则返回相同的hash值
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
