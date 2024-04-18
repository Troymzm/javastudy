package com.basic.object;

public class ObjectHomework05 {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.area());
        System.out.println(circle.len());
    }
}

class Circle {
    double radius;
    double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return this.pi * this.radius * this.radius;
    }

    public double len() {
        return this.pi * this.radius * 2;
    }
}
