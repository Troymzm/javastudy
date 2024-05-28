package com.advancedOOP.thread.method;

/**
 * @author mzm
 * @version 1.0
 * 守护线程
 */
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        // 如果我们希望当main线程结束后子线程自动结束 只需将子线程设为守护线程即可
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("!!!");
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("...");
        }
    }
}