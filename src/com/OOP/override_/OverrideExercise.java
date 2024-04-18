package com.OOP.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person jack = new Person("jack", 18);
        System.out.println(jack.say());

        Student smith = new Student("smith", 18, 123456, 145.2);
        System.out.println(smith.say());
    }
}
