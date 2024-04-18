package com.superOOP.set_;

/**
 * @author mzm
 * @version 1.0
 */
public class HashSetStructure {
    public static void main(String[] args) {
        // 模拟一个HashSet的底层 (HashMap 的底层结构)

        // 1. 创建一个数组 数组的类型是Node[] 称为表
        Node[] table = new Node[16];
        // 2. 创建节点
        Node john = new Node("john", null);
        table[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        Node rose = new Node("rose", null);
        jack.next = rose;
        // john -> jack -> rose  索引为2
        Node lucy = new Node("lucy", null);
        table[3] = lucy;
    }
}
class Node { // 节点 存储数据 可以指向下一个节点 从而形成链表
    Object item; // 存储数据
    Node next; // 指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}