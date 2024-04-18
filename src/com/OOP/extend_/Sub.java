package com.OOP.extend_;

public class Sub extends Base {
    public Sub() {
        // 默认调用父类的无参构造器 super()
        System.out.println("sub()...");
    }
    public Sub(String name) {
        // 默认调用父类的无参构造器 super() 如果父类没有无参构造器则需要自己指定super()
        super("jack", 18); // super必须放在第一行 因此super和this不能共存
        System.out.println("sub(String name)...");
    }
    public void sayOK() {
        // 非私有的属性和方法可以在子类中直接访问
        // 私有的属性和方法不能在子类直接访问
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(getN4());
        test100();
        test300();
        test300();
        callTest400();
    }
}
