package com.superOOP.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author mzm
 * @version 1.0
 */
public class CollectionIterator {
    @SuppressWarnings({"unchecked", "MismatchedQueryAndUpdateOfCollection"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 34.6));

        // 遍历col集合
        // 先得到 col 对应的迭代器
        Iterator iterator = col.iterator();
        // 使用 while 循环遍历
        while (iterator.hasNext()) {  // 判断是否还有数据
            // 返回下一个元素 类型是Object
            Object obj = iterator.next();
            System.out.println(obj);
        }
        // 退出循环后 iterator 迭代器指向最后的元素 如果希望再次遍历 需要重置迭代器
        iterator = col.iterator();

        // 快速生成 while => itit
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}