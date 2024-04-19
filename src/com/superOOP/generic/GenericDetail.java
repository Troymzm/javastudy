package com.superOOP.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mzm
 * @version 1.0
 */
public class GenericDetail {
    public static void main(String[] args) {
        // 给泛型指向数据类型时 要求是引用类型 不能是基本数据类型
        List<Integer> list = new ArrayList<Integer>();

        // 因为 E 指定了 A 类型 构造器传入了 new A()
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        // 在给泛型指定具体类型后 可以传入该类型或者其子类类型
        Pig<A> bPig = new Pig<A>(new B());
        bPig.f();

        // 泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        // 实际开发中 往往简写 编译器进行类型推断
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        ArrayList<Pig> pigs = new ArrayList<>();
        // 默认泛型是Object
        ArrayList objects = new ArrayList();
        Tiger Tiger = new Tiger();
    }
}
class A {}
class B extends A {}
class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f() {
        System.out.println(this.e.getClass());
    }
}
class Tiger<E> {
    E e;

    public Tiger(E e) {
        this.e = e;
    }

    public Tiger() {

    }
}