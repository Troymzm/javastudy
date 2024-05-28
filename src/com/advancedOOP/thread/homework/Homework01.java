package com.advancedOOP.thread.homework;


import java.util.Scanner;

/**
 * @author mzm
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(new T2(t1));
        thread1.start();
        thread2.start();
    }
}
class T1 implements Runnable {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println((int)(Math.random()*100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class T2 implements Runnable{
    Scanner scanner = new Scanner(System.in);
    private T1 t1;

    public T2(T1 t1) {
        this.t1 = t1;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("输入Q结束");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                t1.setLoop(false);
                break;
            }
        }
    }
}