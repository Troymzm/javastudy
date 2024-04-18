package com.OOP.objecthomework.homework03;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }

    public void teach() {
        System.out.println("认真讲课");
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }

    public void printInfo() {
        System.out.println("教师的信息: ");
        System.out.println(super.basicInfo());
        System.out.println("工龄: " + work_age);
        teach();
        System.out.println(play());
    }
}
