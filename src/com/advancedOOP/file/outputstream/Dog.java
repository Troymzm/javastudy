package com.advancedOOP.file.outputstream;

import java.io.Serial;
import java.io.Serializable;

public class Dog implements Serializable { // 序列化具有可继承性
    private String name;
    private int age;

    // static 和 transient 的属性不会序列化
    private static String nation;
    private transient String colour;
    private Master master = new Master(); // 所有成员都需要序列化

    @Serial
    private static final long serialVersionUID = 1L; // 序列化的序列号

    public Dog(String name, int age, String colour, String nation) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.nation = nation;
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

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Dog.nation = nation;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}' + nation;
    }
}
