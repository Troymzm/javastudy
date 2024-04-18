package com.superOOP.innerclass;

/**
 * 匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{
    private int n1 = 10;
    public void method() {
        // 基于接口的匿名内部类
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        };
        // tiger 的编译类型是 IA 运行类型是 匿名内部类 Outer04$1
        /*
        底层
        class Outer04$1 implements IA {
            @Override
            public void cry() {
                System.out.println("老虎叫");
            }
        }
         */
        // 底层在创建匿名内部类之后立即创建实例 并且把地址返回给 tiger
        System.out.println(tiger.getClass()); // getClass() 获取对象的运行类型
        tiger.cry();
        // 匿名内部类使用一次就不能再使用

        // 基于类的匿名内部类
        Father father = new Father("jack"){
            // 形参列表会传递给构造器
            @Override
            public void test() {
                System.out.println("重写test");
            }
        };
        /*
        底层
        class Outer04$2 extends Father {

        }
         */
        // father 编译类型Father 运行类型 Outer04$2
        System.out.println(father.getClass());
        father.test();

        // 基于抽象类的匿名内部类
        Animal animal = new Animal(){

            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}
interface IA{
    void cry();
}
class Father {
    public Father(String name) {
        System.out.println("构造器接收" + name);

    }
    public void test(){

    }
}
abstract class Animal {
    abstract void eat();
}
