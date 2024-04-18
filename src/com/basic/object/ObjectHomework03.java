package com.basic.object;

public class ObjectHomework03 {
    public static void main(String[] args) {
        Book book = new Book("aaaaa", 159);
        book.updatePrice();
        book.info();
    }
}

class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price > 100) {
            this.price = 100;
        } else {
        }
    }

    public void info() {
        System.out.println(this.name + "的价格为" + this.price);
    }
}
