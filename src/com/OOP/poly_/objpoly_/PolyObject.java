package com.OOP.poly_.objpoly_;

public class PolyObject {
    public static void main(String[] args) {
        // 对象多态
        // animal 编译类型就是 Animal 运行类型是 Dog
        Animal animal = new Dog();
        animal.cry(); // 此时 animal 的运行类型是 Dog
        animal = new Cat();
        animal.cry(); // 此时 animal 的运行类型是 Cat
    }
}
