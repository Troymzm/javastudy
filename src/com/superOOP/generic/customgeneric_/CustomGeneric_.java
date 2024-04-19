package com.superOOP.generic.customgeneric_;

 /**
 * @author mzm
 * @version 1.0
 */
public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}
// Tiger 后面泛型 所以我们把 Tiger 称为 自定义泛型类
// T R M 为泛型的标识符 一般是单个大写字母 泛型标识符可以有多个
// 普通成员可以使用泛型

class Tiger<T, R, M> {
    String name;
    R r; // 属性使用泛型
    M m;
    T t;
    // 使用泛型的数组 不能初始化
    // T[] ts = new T[8]; 报错 new 的时候不能确定T的类型 就无法开辟存储空间

    // 因为静态是和类相关 在类加载时 对象还没有创建 如果静态方法和静态属性使用了泛型 就无法完成类的初始化 静态方法中不能使用类的泛型
    //    public static void m1(M m) {    }
    //    static R r2;

    public Tiger(String name, R r, M m, T t) {
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }
    // 方法使用泛型 返回类型使用泛型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}