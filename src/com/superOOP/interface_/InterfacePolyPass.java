package com.superOOP.interface_;

// 多态传递现象
public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();
        // 接口类型的变量可以指向 实现了该接口的类的对象实例
        IH ih = new Teacher();
        // 如果IG继承了IH接口 而Teacher 类实现了IG接口 那么实际上就相当于 Teacher类也继承了IH接口
    }
}

interface IH {}
interface IG extends IH {}
class Teacher implements IG {

}