package com.advancedOOP.thread.ticket;

/**
 * @author mzm
 * @version 1.0
 * 使用多线程 模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        sellTicket01.start(); // 启动售票
//        sellTicket02.start();
//        sellTicket03.start();
//        // 会出现超卖


        SellTicket02 sellTicket02 = new SellTicket02();
        // 同一个对象开启三个线程
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        new Thread(sellTicket02).start();
        // 会出现超卖
    }
}
class SellTicket01 extends Thread {
    private static int ticketNum = 100; // 让多个线程共享 ticketNum

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
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
}
class SellTicket02 implements Runnable {
    private int ticketNum = 100;
    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
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
}