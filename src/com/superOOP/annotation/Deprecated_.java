package com.superOOP.annotation;

/**
 * @author mzm
 * @version 1.0
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}
// @Deprecated 修饰某个元素 表示该元素已经过时 即不再推荐使用 作为新老版本之间的过渡
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi() {
    }
}