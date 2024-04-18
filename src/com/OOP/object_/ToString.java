package com.OOP.object_;

public class ToString {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "巡山", 1000);
        System.out.println(monster.toString());
//        当直接输出一个对象时会默认调用toString
        System.out.println(monster);
    }
}
class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
    // 重写toString方法 输出对象的属性

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}