package com.superOOP.enum_;

/**
 * @author mzm
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SPRING);
        System.out.println(Season2.SUMMER);
        System.out.println(Season2.WINTER);
    }
}
// enum 关键字来实现枚举类 不能再继承其他的类了 因为是单继承机制 但可以实现接口
enum Season2 {
    /*
    1. 使用enum替代class
    2. public static final Season SPRING = new Season("Spring", "warm"); 直接使用SPRING("spring","warm");代替    常量名(实参列表)
    3. 如果有多个常量 使用, 间隔即可
    4. 要求将定义常量对象 写在最前面(行首)
     */
    SPRING("spring","warm"), WINTER("winter", "cold"), AUTUMN("autumn", "cool"), SUMMER("summer", "hot");// , WHAT
    private String name;
    private String desc;
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    private Season2() {

    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
// enum 默认继承 Enum 类 而且是一个final类 enum对象本质是静态的
// 如果使用无参构造器创建枚举对象时 实参列表和小括号都可以省略
// 当有多个枚举对象时 使用逗号间隔
