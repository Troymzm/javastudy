package com.advancedOOP.thread.homework;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        new Thread(t).start();
        new Thread(t).start();
    }
}
class T implements Runnable {
    private int money = 10000;
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            bank();
        }
    }

    public synchronized void bank() {
        if (money < 1000) {
            System.out.println("余额不足");
            loop = false;
            return;
        }
        money -= 1000;
        System.out.println(Thread.currentThread().getName() + "取出了1000元" + "余额为" + money + "元");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}