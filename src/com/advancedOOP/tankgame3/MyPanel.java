package com.advancedOOP.tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author mzm
 * @version 1.0
 * 坦克大战的绘图区域
 */
// 为了不停重绘子弹 需要将MyPanel实现Runnable接口 当作一个线程
public class MyPanel extends JPanel implements KeyListener, Runnable {
    // 定义我的坦克
    Hero hero = null;
    // 定义敌人的坦克 放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;
    public MyPanel() {
        hero = new Hero(100, 100); // 初始化自己坦克
//        hero.setSpeed(20);
        for (int i = 0; i < enemyTankSize; i++) {  // 初始化敌人的坦克
            // 创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            // 设置方向
            enemyTank.setDirect(2);
            // 加入子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            // 加入到Vector
            enemyTank.shots.add(shot);
            // 启动shot 对象
            new Thread(shot).start();
            // 加入
            enemyTanks.add(enemyTank);
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); // 填充矩形 默认黑色
        // 画出自己坦克 封装方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);

        // 画出子弹
        if (hero.shot != null && hero.shot.isLive == true) {
//            g.setColor(Color.red);
            g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
        }
        // 画出敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            // 取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
            // 画出enemyTank 的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                // 取出子弹
                Shot shot = enemyTank.shots.get(j);
                // 绘制
                if (shot.isLive) {
                    g.draw3DRect(shot.x, shot.y, 2, 2, false);
                } else {
                    // 移除
                    enemyTank.shots.remove(shot);
                }
            }
        }
    }
    // 编写方法 画出坦克
    /**
     *
     * @param x 坦克左上角x坐标
     * @param y 坦克左上角y坐标
     * @param g 画笔
     * @param direct 坦克方向(上下左右)
     * @param type 坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        // 根据不同类型坦克 设置不同颜色
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        // 根据坦克方向绘制坦克
        switch (direct) {
            case 0: // 表示向上
                g.fill3DRect(x, y, 10, 60, false); // 画出左侧轮子
                g.fill3DRect(x + 30, y, 10, 60, false); // 画出右侧轮子
                g.fill3DRect(x + 10 ,y + 10 , 20, 40, false); // 画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y);
                break;
            case 1: // 表示向右
                g.fill3DRect(x, y, 60, 10, false); // 画出左侧轮子
                g.fill3DRect(x, y + 30, 60, 10, false); // 画出右侧轮子
                g.fill3DRect(x + 10 ,y + 10 , 40, 20, false); // 画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2: // 表示向下
                g.fill3DRect(x, y, 10, 60, false); // 画出左侧轮子
                g.fill3DRect(x + 30, y, 10, 60, false); // 画出右侧轮子
                g.fill3DRect(x + 10 ,y + 10 , 20, 40, false); // 画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                break;
            case 3: // 表示向左
                g.fill3DRect(x, y, 60, 10, false); // 画出左侧轮子
                g.fill3DRect(x, y + 30, 60, 10, false); // 画出右侧轮子
                g.fill3DRect(x + 10 ,y + 10 , 40, 20, false); // 画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x, y + 20, x + 30, y + 20);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) { // 按下W键
            // 改变坦克方向
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            hero.moveLeft();
        }
        this.repaint();
        // 发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.shotEnemyTank();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { // 每隔100ms重绘区域
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.repaint();
        }
    }
}
