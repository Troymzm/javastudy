package com.advancedOOP.thread.basic;

/**
 * @author mzm
 * @version 1.0
 * 通过实现接口Runnable 开发线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // 这里不能调用start
        // 创建Thread对象 把dog对象放入Thread -- 代理设计模式
        Thread thread = new Thread(dog);
        thread.start();
        Tiger tiger = new Tiger();
        Proxy proxy = new Proxy(tiger);
        proxy.start();
    }
}
class Animal{}
class Tiger extends Animal implements Runnable{
    @Override
    public void run() {
        System.out.println("hhh");
    }
}
class Dog implements Runnable { // 通过实现接口Runnable 开发线程
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("ustc" + (++count) + "线程名" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                break;
            }
        }
    }
}

// 线程代理类
class Proxy implements Runnable { // 代理Thread
    private Runnable target = null; // 属性 类型是Runnable
    @Override
    public void run() {
        if(target != null) {
            target.run(); // 动态绑定
        }
    }
    public Proxy(Runnable target) {
        this.target = target;
    }
    public void start() {
        start0(); // 真正实现多线程的方法
    }
    public void start0() {
        run();
    }
}