package com.OOP.objecthomework.homework03;

public class Student extends Person {
    private String stu_id;

    public Student(String name, char gender, int age, String stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }

    public void study() {
        System.out.println("好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }
    public void printInfo() {
        System.out.println("学生的信息: ");
        System.out.println(super.basicInfo());
        System.out.println("学号: " + stu_id);
        study();
        System.out.println(play());
    }
}
