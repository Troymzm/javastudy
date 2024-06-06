package com.advancedOOP.file.homework;


import java.io.*;
import java.util.Properties;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));

        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        // 序列化
        String serFilePath = "E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\file\\homework\\dog.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(serFilePath));

        objectOutputStream.writeObject(dog);

        objectOutputStream.close();
        System.out.println("序列化完成");

        // 反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog1 = (Dog) objectInputStream.readObject();
        System.out.println("反序列化的信息");
        System.out.println(dog1);
        objectInputStream.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
