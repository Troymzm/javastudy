package com.superOOP.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager aaron = new Manager("aaron", 999, 50000);
        aaron.setBonus(8000);
        aaron.work();

        CommonEmployee jack = new CommonEmployee("jack", 888, 20000);
        jack.work();
    }
}
