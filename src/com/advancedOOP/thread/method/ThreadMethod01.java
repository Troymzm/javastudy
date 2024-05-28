package com.advancedOOP.thread.method;

/**
 * @author mzm
 * @version 1.0
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        // 测试相关方法
        T t = new T();
        t.setName("aaron"); // 设置线程名称
        t.setPriority(Thread.MIN_PRIORITY); // 设置线程优先级
        t.start(); // 启动子线程

        // 主线程打印5个hi 中断 子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }

        System.out.println(t.getName() + "线程优先级" + t.getPriority());
        t.interrupt(); // 提前结束休眠
    }
}
class T extends Thread {  //自定义的线程类
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子～" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中～");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
            }
        }
    }
}