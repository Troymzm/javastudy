package com.OOP.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dahuang = new Dog("dahuang");
        Bone dabanggu = new Bone("dabanggu");

        tom.feed(dahuang,dabanggu);

        Cat xiaohua = new Cat("xiaohua");
        Fish huanghua = new Fish("huanghua");

        tom.feed(xiaohua,huanghua);
    }
}
