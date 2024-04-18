package com.superOOP.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie aaron = new Movie("aaron");
        Movie fsl = new Movie("fsl", 100);
        Movie movie = new Movie("cbx", 1100, "lib");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;
    // 当我们不管调用哪个构造器都会调用代码块 代码块调用优先于构造器
    {
        System.out.println("屏幕打开");
        System.out.println("放电影");
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
