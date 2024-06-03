package com.advancedOOP.tankgame3;

/**
 * @author mzm
 * @version 1.0
 * 自己的坦克
 */
public class Hero extends Tank {
    public Hero(int x, int y) {
        super(x, y);
    }
    // 定义一个Shot对象
    Shot shot = null;

    // 射击
    public void shotEnemyTank() {
        // 创建Shot对象
        // 根据 当前Hero对象的位置和方向来创建
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
        // 启动Shot线程
        Thread thread = new Thread(shot);
        thread.start();
    }
}
