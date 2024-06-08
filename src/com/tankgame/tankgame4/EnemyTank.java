package com.tankgame.tankgame4;

import java.util.Vector;

/**
 * @author mzm
 * @version 1.0
 * 敌人的坦克
 */
public class EnemyTank extends Tank implements Runnable{
    // 在敌人坦克类 使用Vector 保存多个Shot
    Vector<Shot> shots = new Vector<>();
    // 增加成员 EnemyTank 可以得到敌人坦克的Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    public void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        this.enemyTanks = enemyTanks;
    }

    // 判断当前坦克是否和enemyTanks中其他坦克发生重叠或者碰撞
    public boolean isTouchEnemyTank() {
        // 判断当前坦克方向
        switch (this.getDirect()) {
            case 0:
                // 让当前坦克与其他所有的敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // 取出一辆坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // 不和自己比较
                    if (enemyTank != this) {
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 如果敌人坦克是上下方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 40]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 60]
                            // 当前坦克左上角坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40 && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 当前坦克右上角坐标[this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40 && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            // 如果敌人坦克是左右方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 60]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 40]
                            // 当前坦克左上角坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60 && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            // 当前坦克右上角坐标[this.getX() + 40, this.getY()]
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 60 && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1:
                // 让当前坦克与其他所有的敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // 取出一辆坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // 不和自己比较
                    if (enemyTank != this) {
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 如果敌人坦克是上下方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 40]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 60]
                            // 当前坦克右上角坐标[this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40 && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 当前坦克右下角坐标[this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 40 && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            // 如果敌人坦克是左右方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 60]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 40]
                            // 当前坦克右上角坐标[this.getX() + 60, this.getY()]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60 && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            // 当前坦克右下角坐标[this.getX() + 60, this.getY() + 40]
                            if (this.getX() + 60 >= enemyTank.getX() && this.getX() + 60 <= enemyTank.getX() + 60 && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 2:
                // 让当前坦克与其他所有的敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // 取出一辆坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // 不和自己比较
                    if (enemyTank != this) {
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 如果敌人坦克是上下方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 40]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 60]
                            // 当前坦克左下角坐标[this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40 && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60<= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 当前坦克右下角坐标[this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 40 && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 60) {
                                return true;
                            }
                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            // 如果敌人坦克是左右方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 60]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 40]
                            // 当前坦克左下角坐标[this.getX(), this.getY() + 60]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60 && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                            // 当前坦克右下角坐标[this.getX() + 40, this.getY() + 60]
                            if (this.getX() + 40 >= enemyTank.getX() && this.getX() + 40 <= enemyTank.getX() + 60 && this.getY() + 60 >= enemyTank.getY() && this.getY() + 60 <= enemyTank.getY() + 40) {
                                return true;
                            }
                        }
                    }
                }
                break;
            case 3:
                // 让当前坦克与其他所有的敌人坦克比较
                for (int i = 0; i < enemyTanks.size(); i++) {
                    // 取出一辆坦克
                    EnemyTank enemyTank = enemyTanks.get(i);
                    // 不和自己比较
                    if (enemyTank != this) {
                        if (enemyTank.getDirect() == 0 || enemyTank.getDirect() == 2) {
                            // 如果敌人坦克是上下方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 40]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 60]
                            // 当前坦克左上角坐标[this.getX(), this.getY()]
                            if (this.getX()>= enemyTank.getX() && this.getX()<= enemyTank.getX() + 40 && this.getY()>= enemyTank.getY() && this.getY()<= enemyTank.getY() + 60) {
                                return true;
                            }
                            // 当前坦克左下角坐标[this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 40 && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40<= enemyTank.getY() + 60) {
                                return true;
                            }

                        }
                        if (enemyTank.getDirect() == 1 || enemyTank.getDirect() == 3) {
                            // 如果敌人坦克是左右方向
                            // x 的范围[enemyTank.getX(), enemyTank.getX() + 60]
                            // y 的范围[enemyTank.getY(), enemyTank.getX() + 40]
                            // 当前坦克左上角坐标[this.getX(), this.getY()]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60 && this.getY() >= enemyTank.getY() && this.getY() <= enemyTank.getY() + 40) {
                                return true;
                            }
                            // 当前坦克左下角坐标[this.getX(), this.getY() + 40]
                            if (this.getX() >= enemyTank.getX() && this.getX() <= enemyTank.getX() + 60 && this.getY() + 40 >= enemyTank.getY() && this.getY() + 40 <= enemyTank.getY() + 40) {
                                return true;
                            }

                        }
                    }
                }
                break;
        }
        return false;
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
                        if (getY() > 0 && !isTouchEnemyTank()) {
                            this.moveUp();
                            // 休眠
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 50; i++) {
                        if (getX() + 60 < 1000 && !isTouchEnemyTank()) {
                            this.moveRight();
                            // 休眠
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < 50; i++) {
                        if (getY() + 60 < 750 && !isTouchEnemyTank()) {
                            this.moveDown();
                            // 休眠
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 50; i++) {
                        if (getX() > 0 && !isTouchEnemyTank()) {
                            this.moveLeft();
                            // 休眠
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
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
