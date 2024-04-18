package com.superOOP.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        // 匿名内部类当做实参直接传递
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画");
            }
        });
    }
    // 静态方法 形参是接口类型
    public static void f1(IL il) {
        il.show();
    }
}
interface IL {
    void show();
}