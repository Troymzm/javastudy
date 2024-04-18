package com.OOP.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("jack", 18, 100);
        persons[2] = new Student("smith", 19, 110);
        persons[3] = new Teacher("jack", 18, 10000);
        persons[4] = new Teacher("smith", 19, 11000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say()); // 动态绑定机制 编译类型都是Person 运行类型不同
            // 类型判断 + 向下转型
            if (persons[i] instanceof Student) { // 判断运行类型
                ((Student)persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher)persons[i]).teach();
            } else {

            }
        }
    }
}
