package com.superOOP.generic_;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author mzm
 * @version 1.0
 */
public class GenericExercise01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("aaron", 120,new MyDate(6, 22, 2005)));
        employees.add(new Employee("aaron", 120,new MyDate(7, 22, 2005)));
        employees.add(new Employee("aaron", 120,new MyDate(8, 22, 2005)));
        employees.add(new Employee("troy", 120,new MyDate(6, 22, 2005)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().compareTo(o2.getName()) != 0) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.getBirthday().compareTo(o2.getBirthday()) != 0) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
                return 0;
            }
        });
        for (Employee employee :employees) {
            System.out.println(employee);
        }
    }
}
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名: " + name + "\t工资: " + sal + "\t生日: " + birthday;
    }
}
class MyDate implements Comparable<MyDate> {
    private int month;
    private int day;
    private int year;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%d年%d月%d日",year,month,day);
    }

    @Override
    public int compareTo(MyDate o) {
        if (this.getYear() - o.getYear() != 0) {
            return this.getYear() - o.getYear();
        }
        if (this.getMonth() - o.getMonth() != 0) {
            return this.getMonth() - o.getMonth();
        }
        if (this.getDay() - o.getDay() != 0) {
            return this.getDay() - o.getDay();
        }
        return 0;
    }
}