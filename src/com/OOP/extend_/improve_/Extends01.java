package com.OOP.extend_.improve_;

import com.OOP.extend_.Graduate;
import com.OOP.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        com.OOP.extend_.Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        com.OOP.extend_.Graduate graduate = new Graduate();
        graduate.name = "冯硕兰";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();

    }
}
