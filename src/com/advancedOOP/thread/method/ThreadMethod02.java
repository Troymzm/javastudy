package com.advancedOOP.thread.method;

/**
 * @author mzm
 * @version 1.0
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程" + i);
            if (i == 5) {
                System.out.println("主线程让子线程先执行");
                // join 线程插队
                t2.join(); // 相当于让子线程先执行完毕
                System.out.println("主线程继续执行");
            }
            if (i == 2) {
                System.out.println("主线程礼让");
                // yield 线程礼让
                Thread.yield(); // 相当于让子线程先执行完毕
                System.out.println("主线程继续执行");
            }
        }
    }
}
class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("子线程" + i);
        }
    }
}