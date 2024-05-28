package com.advancedOOP.thread.basic;

/**
 * @author mzm
 * @version 1.0
 * 继承Thread类创建线程
 */
public class Thread01 {
    public static void main(String[] args) {
        // 创建一个Cat对象 可以当做线程使用
        Cat cat = new Cat();
        cat.start(); // 启动线程 执行cat的run方法
        // 直接用cat.run() 不会启动线程
        // 当main线程启动一个子线程Thread-0 主线程不会阻塞 会继续执行
        for (int i = 0; i < 80; i++) {
            System.out.println("主线程" + i + "主线程名称" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
// 当一个类继承了 Thread 类 该类就可以当做线程使用
// 我们会重写run方法 写上自己的业务代码
// run Thread 类 实现了 Runnable 接口的 run 方法
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() { // 重写run方法
        while (true) {
            // 每隔一秒输出"ustc"
            System.out.println("ustc" + (++times) + "线程名" + Thread.currentThread().getName());
            // 让线程休眠1s ctrl + alt + t
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break; // 当times到5 退出while 退出线程
            }
        }
    }
}