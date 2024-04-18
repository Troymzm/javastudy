package com.basic.object;

public class ObjectHomework08 {
    public static void main(String[] args) {
        Circle01 c = new Circle01();
        PassObject p = new PassObject();
        p.printAreas(c, 6);
    }
}

class Circle01 {
    double radius;

    public Circle01() {

    }

    public Circle01(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle01 c, int times) {
        System.out.println("Radius\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.print((double) i + "\t" + c.findArea());
            System.out.println();
        }
    }
}
