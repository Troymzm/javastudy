package com.advancedOOP.thread.syn;

/**
 * @author mzm
 * @version 1.0
 * 使用多线程 模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
        SellTicket03 sellTicket03 = new SellTicket03();
        // 同一个对象开启三个线程
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        new Thread(sellTicket03).start();
        // 不会出现超卖
    }
}

// 实现接口方式 使用synchronized实现线程同步
class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;
    Object object = new Object();
    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
    // 同步方法 此时互斥锁在this对象
    // 也可以在代码块上写synchronized 同步代码块
    public /*synchronized*/ void sell() {  // 同步方法 在同一时刻 只能有一个线程来执行sell方法
        synchronized (/*this*/ object) {  // 同步代码块
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票");
            System.out.println("剩余票数=" + (--ticketNum));
        }
    }

    // 同步方法(静态的)的锁为当前类本身
    public synchronized static void m1() {
        // 锁加在SellTicket03.class
    }
    public static void m2() {
        // 同步代码块 不能加在this上  （静态的无法使用this）
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }
    // 必须保证多个线程的锁的对象是同一个对象
}