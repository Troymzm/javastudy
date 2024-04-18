package com.superOOP.list_;

/**
 * @author mzm
 * @version 1.0
 */
public class LinkedList01 {
    public static void main(String[] args) {
        // 模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node mary = new Node("mary");

        // 连接三个节点 形成双向链表
        // jack -> tom -> mary
        jack.next = tom;
        tom.next = mary;
        // mary -> tom -> jack
        tom.pre = jack;
        mary.pre = tom;
        // 让first 引用指向jack 就是双向链表的头结点
        Node first = jack;
        // 让last 引用指向mary 就是双向链表的尾结点
        Node last = mary;

        // 从头到尾遍历
        while (true) {
            if (first == null) {
                break;
            }
            // 输出first 信息
            System.out.println(first);
            first = first.next;
        }

        // 从尾到头遍历
        while (true) {
            if (last == null) {
                break;
            }
            // 输出first 信息
            System.out.println(last);
            last = last.pre;
        }

        // 添加数据
        Node kitty = new Node("kitty");
        kitty.next = mary;
        tom.next = kitty;

        kitty.pre = tom;
        mary.pre = kitty;

        // 让first 引用指向jack 就是双向链表的头结点
        first = jack;
        // 让last 引用指向mary 就是双向链表的尾结点
        last = mary;

        // 从头到尾遍历
        while (true) {
            if (first == null) {
                break;
            }
            // 输出first 信息
            System.out.println(first);
            first = first.next;
        }

        // 从尾到头遍历
        // 从尾到头遍历
        while (true) {
            if (last == null) {
                break;
            }
            // 输出first 信息
            System.out.println(last);
            last = last.pre;
        }
    }
}
// 定义一个 Node 类 表示双向链表的一个节点
class Node {
    public Object item; // 真正存放数据
    public Node next; // 指向后一个节点
    public Node pre; // 指向前一个节点
    public Node(Object name) {
        this.item = name;
    }
    public String toString() {
        return "Node name = " + item;
    }
}