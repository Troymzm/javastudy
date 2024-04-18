package com.superOOP.collection_;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(1, "aa")); // ClassCastException
        // add 方法 因为构造器没有传入 Comparator 接口的匿名内部类 所以底层会把 Person 类 转换成 Comparator 类型 但并没有实现 compare 方法 故抛出异常
    }
}
class Person{
    public int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}