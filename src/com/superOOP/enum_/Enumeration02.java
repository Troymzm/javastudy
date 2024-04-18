package com.superOOP.enum_;

/**
 * @author mzm
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.WINTER);
    }
}
// 自定义枚举
/*
1. 构造器私有化 -- 防止new
2. 去掉set方法 -- 防止属性被修改
3. 在类内部直接创建固定的对象
4. 优化 可以加入 final 修饰符
 */
class Season {
    private String name;
    private String desc;

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    // 定义了4个对象
    public static final Season SPRING = new Season("Spring", "warm");
    public static final Season WINTER = new Season("Winter", "cold");
    public static final Season SUMMER = new Season("Summer", "hot");
    public static final Season AUTUMN = new Season("Autumn", "cool");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}