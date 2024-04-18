package com.superOOP.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        EE ee = new EE();
        ee.cal();
    }
}
class AA {
    /*
    1. 定义时: 如public final double TAX_RATE = 0.08;
    2. 在构造器中
    3. 在代码块中
     */
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    public AA() {
        TAX_RATE2 = 1.1;
    }
    {
        TAX_RATE3 = 1.1;
    }
}

class BB {
    // 如果final修饰的属性是静态的 则初始化的位置只能是定义时或者在静态代码块 不能在构造器中赋值
    public static final double TAX_RATE = 0.08;
    public static final double TAX_RATE2;
    static {
        TAX_RATE2 = 1.1;
    }
}
// final 类不能继承 但可以实例化对象
final class CC {

}
// 如果类不是final类 但是含有final方法 则该方法虽然不能重写 但是可以被继承
class DD {
    public final void cal() {
        System.out.println("cal()方法");
    }
}
class EE extends DD {

}