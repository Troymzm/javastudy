package com.superOOP.generic;

/**
 * @author mzm
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> aaron = new Person<String>("aaron");
        aaron.show();
        // 把所有的E用String 表示
        Person<Integer> i = new Person<Integer>(1);
        i.show();
        // 接口和类都可以有泛型 迭代器取出也可以指定泛型
    }
}
// 泛型的作用是 可以在类声明时通过一个标识表示类中某个属性的类型 或者某个方法的返回值的类型 或者是参数类型
class Person<E> {
    E s; // E 表示 s 的数据类型 该数据类型在定义Person对象的时候指定 即在编译时 就确定 E 是什么类型

    public Person(E s) { // E 也是参数类型
        this.s = s;
    }

    public E f() { // 返回类型使用 E
        return s;
    }

    public void show() {
        System.out.println(s.getClass());
    }
}