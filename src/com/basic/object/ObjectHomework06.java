package com.basic.object;

public class ObjectHomework06 {
    public static void main(String[] args) {
        Cale cale1 = new Cale(10.2, 0);
        if (cale1.div() != null) {
            System.out.println(cale1.div());
        } else {
            System.out.println("除数不能为0");
        }

    }
}

class Cale {
    double num1, num2;

    public Cale(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum() {
        return this.num1 + this.num2;
    }

    public double minus() {
        return this.num1 - this.num2;
    }

    public double mul() {
        return this.num1 * this.num2;
    }

    public Double div() {
        if (this.num2 == 0) {
            return null;
        } else {
            return this.num1 + this.num2;
        }
    }
}