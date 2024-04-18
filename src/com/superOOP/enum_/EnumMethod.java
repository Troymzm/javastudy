package com.superOOP.enum_;

/**
 * @author mzm
 * @version 1.0
 * 演示Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        // 使用Season2枚举类
        Season2 autumn = Season2.AUTUMN;
        // 输出枚举对象的名称
        System.out.println(autumn.name());
        // ordinal() 输出的是该枚举对象的次序 从0开始编号
        System.out.println(autumn.ordinal());
        // values() 返回 Season2[] 含有定义的所有对象
        Season2[] values = Season2.values();
        // 增强 for 循环
        for (Season2 season: values) {
            System.out.println(season);
        }
        // 相当于Python中 for i in values
        // valueof() 将字符串转换成枚举对象 要求字符串必须为已有的常量名 否则报异常
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println(autumn1);
        // compareTo 比较两个枚举常量 比较的就是编号 return self.ordinal - other.ordinal
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
    }
}
