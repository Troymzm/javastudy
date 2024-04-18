package com.superOOP.list_;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("aaa", 100 ,"aaa"));
        list.add(new Book("bbb", 10 ,"bbb"));
        list.add(new Book("ccc", 9 ,"ccc"));
        list.add(new Book("ddd", 80 ,"ddd"));
        list.add(new Book("eee", 10 ,"eee"));

        // 按价格从低到高排序
        bubbleSort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double d1 = (Double) o1;
                double d2 = (Double) o2;
                return (int)(d1 - d2);
            }
        });

        // 遍历
        for (Object object :list) {
            System.out.println(object);
        }

    }
    public static void bubbleSort(List list, Comparator c) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (c.compare(((Book)list.get(j)).getPrice(), ((Book)list.get(j + 1)).getPrice()) > 0) {
                    Book temp = null;
                    temp = (Book) list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称: " + name + "\t" + "价格: " + price + "\t" + "作者: " + author;
    }
}
