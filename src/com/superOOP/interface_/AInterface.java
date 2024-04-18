package com.superOOP.interface_;

public interface AInterface {
    // 写属性
    public int n1 = 10;
    // 写方法
    // 在接口中 抽象方法可以省略abstract关键字
    public void hi();
    // 可以有默认实现方法 需要使用default修饰
    default public void ok() {
        System.out.println("ok");
    }
    // 可以有静态方法
    public static void cry() {
        System.out.println("cry");
    }
}
