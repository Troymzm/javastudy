package com.superOOP.generic_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author mzm
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();
        map.put("aa", new Student("aa", 11));
        map.put("bb", new Student("bb", 22));
        map.put("cc", new Student("cc", 33));

        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + ": " + next.getValue());
        }

        for (Map.Entry<String, Student> entry :entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
