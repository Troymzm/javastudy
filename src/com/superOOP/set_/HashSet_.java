package com.superOOP.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mzm
 * @version 1.0
 */
public class HashSet_ {
    public static void main(String[] args) {
        Set hashset = new HashSet();
        hashset.add(null);
        hashset.add(null);

        // 执行add 方法后返回一个boolean 值 添加成功返回真 失败返回假
        // 不能加入重复对象
        System.out.println(hashset.add("jack"));
        System.out.println(hashset.add("mary"));
        System.out.println(hashset.add("andy"));
        System.out.println(hashset.add("jack"));
        System.out.println(hashset.add(new Dog("ok")));
        System.out.println(hashset.add(new Dog("ok"))); // 加入成功
        System.out.println(hashset.add(new String("ok")));
        System.out.println(hashset.add(new String("ok"))); // 加入不了的
        // 只要String类的字符串相同，参数hash的值便相同
        // remove 删除
        hashset.remove("mary");
        System.out.println(hashset);
    }
}
class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
