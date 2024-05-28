package com.advancedOOP.thread.syn;

/**
 * @author mzm
 * @version 1.0
 */
public class DeadLock {
    public static void main(String[] args) {
        // 模拟死锁
        DeadLockDemo A = new DeadLockDemo(true);
        DeadLockDemo B = new DeadLockDemo(false);
        A.setName("A线程");
        B.setName("B线程");
        A.start();
        B.start();
    }
}
class DeadLockDemo extends Thread {
    static Object o1 = new Object(); // 保证多线程共享一个对象
    static Object o2 = new Object();
    boolean flag;
    public DeadLockDemo(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        /**
         * 分析
         * 1. 如果flag为true 线程会先持有o1对象锁 然后尝试获取o2对象锁
         * 2. 如果得不到o2对象锁就会Blocked
         * 3. 如果flag为false 线程会先持有o2对象锁 然后尝试获取o1对象锁
         * 4. 如果得不到o1对象锁就会Blocked
         * 5. 如果A持有o1 B持有o2 就会成为死锁
         */
        if (flag) {
            synchronized (o1) { // 对象互斥锁 下面是同步代码
                System.out.println(Thread.currentThread().getName() + "进入1");
                synchronized (o2) { // 这里获得了1对象的监视权
                    System.out.println(Thread.currentThread().getName() + "进入2");
                }
            }
        } else {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "进入3");
                synchronized (o1) { // 这里获得了1对象的监视权
                    System.out.println(Thread.currentThread().getName() + "进入4");
                }
            }
        }
    }
}