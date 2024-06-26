package com.superOOP.generic.customgeneric;

/**
 * @author mzm
 * @version 1.0
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
/*
1. 接口中 静态成员不能使用泛型
2. 泛型接口的类型 在继承接口或者实现接口时确定
3. 没有指定类型 默认 Object
 */
interface IUsb<U, R> {
    // 普通方法中 可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    // 默认方法也可以使用泛型
    default R method(U u) {
        return null;
    }
}

// 在继承接口时 指定接口的类型
interface IA extends IUsb<String, Double> {

}
// 当我们实现IA 接口时 IA 继承 IUsb 接口时 指定了接口类型
class AA implements IA {

    @Override
    public Double get(String string) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}

// 实现接口时 直接指定接口泛型
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
// 没有指定 默认Object
class CC implements IUsb {

    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}