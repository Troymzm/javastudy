package com.advancedOOP.thread.exit_;

/**
 * @author mzm
 * @version 1.0
 */
public class ThreadExit {
    public static void main(String[] args) {
        T t1 = new T();
        t1.start();

        // 如果希望main线程去控制t1 线程的终止 必须可以修改loop 让t1退出run方法 从而终止线程 -> 通知方式

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t1.setLoop(false);
    }
}
class T extends Thread {
    int count = 0;
    // 设置一个控制变量
    private boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("T 运行中..." + (++count));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}