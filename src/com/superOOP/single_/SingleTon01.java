package com.superOOP.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        // System.out.println(GirlFriend.n1);
        // 通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
    }
}
// 饿汉式可能造成创建了对象但没有使用
class GirlFriend {
    private String name;
    // 为了能够在静态方法中返回该对象 需要将其修饰为static
    private static GirlFriend gf = new GirlFriend("fsl"); // 静态属性
    /*
    单例模式饿汉式步骤
    1. 构造器私有化
    2. 在类的内部直接创建
    3. 提供一个公共的static方法 返回对象
     */
    private GirlFriend(String name) {
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
    public static int n1 = 999;
}