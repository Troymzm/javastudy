package com.OOP.objecthomework.homework03;

public class homework03 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 10, "0001");
        persons[1] = new Student("smith", '男', 15, "0002");
        persons[2] = new Teacher("jack", '男', 30, 5);
        persons[3] = new Teacher("smith", '男', 35, 10);

        homework03 homework03 = new homework03();
        homework03.bubbleSort(persons);

        for (int i = 0; i < persons.length; i++) {
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).printInfo();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).printInfo();
            } else {
                break;
            }
        }
    }
    public void bubbleSort(Person[] persons) {
        Person temp = null;
        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}
