package com.tankgame.tankgame3;

import java.util.Vector;

/**
 * @author mzm
 * @version 1.0
 * 敌人的坦克
 */
public class EnemyTank extends Tank implements Runnable{
    // 在敌人坦克类 使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    boolean isLive = true;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            // 创建子弹
            if (isLive && shots.size() < 1) {
                Shot shot = null;
                // 判断坦克方向
                switch (getDirect()) {
                    case 0:
                        shot = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        shot = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        shot = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        shot = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(shot);

                // 启动
                new Thread(shot).start();
            }
            // 随机的改变坦克方向
            this.setDirect((int) (Math.random() * 4));
            // 根据坦克的方向来继续移动
            switch (this.getDirect()) {
                case 0:
                    // 让坦克保持一个方向走50步
                    for (int i = 0; i < 50; i++) {
                        if (getY() > 0) {
                            this.moveUp();
                        }
                        // 休眠
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 50; i++) {
                        if (getX() + 60 < 1000) {
                            this.moveRight();
                        }
                        // 休眠
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 50; i++) {
                        if (getY() + 60 < 750) {
                            this.moveDown();
                        }
                        // 休眠
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 50; i++) {
                        if (getX() > 0) {
                            this.moveLeft();
                        }
                        // 休眠
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
            }
            // 退出
            if (!isLive) {
                break; // 退出线程
            }
        }
    }
}
