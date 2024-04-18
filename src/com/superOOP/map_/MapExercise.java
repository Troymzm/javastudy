package com.superOOP.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author mzm
 * @version 1.0
 */
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new Employee("aa", 19000, 1));
        map.put(2, new Employee("aa", 17000, 2));
        map.put(3, new Employee("aa", 22000, 3));

        Set keySet = map.keySet();
        for (Object key :keySet) {
            if (((Employee)(map.get(key))).getSal() > 18000) {
                System.out.println("id: " + key + " 员工: " + map.get(key));
            }
        }

        Set entrySet = map.entrySet();
        for (Object entry :entrySet) {
            Map.Entry m = (Map.Entry) entry;
            if (((Employee)(m.getValue())).getSal() > 18000) {
                System.out.println("id: " + m.getKey() + " 员工: " + m.getValue());
            }
        }


    }
}
class Employee {
    private String name;
    private double sal;
    private int id;

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
