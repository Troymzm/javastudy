package com.tankgame.tankgame3;

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
    // 定义一个Vector 用于存放炸弹
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    // 定义三张炸弹图片用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        hero = new Hero(100, 100); // 初始化自己坦克
//        hero.setSpeed(20);
        for (int i = 0; i < enemyTankSize; i++) {  // 初始化敌人的坦克
            // 创建一个敌人的坦克
            EnemyTank enemyTank = new EnemyTank((int)(Math.random() * (1000 - 60)), (int)(Math.random() * (750 - 60)));
            // 设置方向
            enemyTank.setDirect((int)(Math.random() * 4));
            // 启动敌人坦克线程
            new Thread(enemyTank).start();
            // 加入子弹
            // Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            // 加入到Vector
            // enemyTank.shots.add(shot);
            // 启动shot 对象
            // new Thread(shot).start();
            // 加入
            enemyTanks.add(enemyTank);
        }
        // 初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage("E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\tankgame3\\1.png");
        image2 = Toolkit.getDefaultToolkit().getImage("E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\tankgame3\\2.png");
        image3 = Toolkit.getDefaultToolkit().getImage("E:\\code\\ideaJava\\javastudy_git\\src\\com\\advancedOOP\\tankgame3\\3.png");
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); // 填充矩形 默认黑色
        if (hero != null && hero.isLive) {
            // 画出自己坦克 封装方法
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }
        // 遍历取出画出子弹
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {
//            g.setColor(Color.red);
                g.draw3DRect(shot.x, shot.y, 2, 2, false);
            } else { // 失效则拿掉
                hero.shots.remove(shot);
            }
        }

        // 防止第一个不爆炸
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 画出炸弹
        for (int i = 0; i < bombs.size(); i++) {
            // 取出炸弹
            Bomb bomb = bombs.get(i);
            // 根据life值画出对应图片
            if (bomb.life > 6) {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            }
            // 让生命值减少
            bomb.lifeDown();
            // 如果life为0删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
        // 画出敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            // 取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            // 判断当前坦克是否存活
            if (enemyTank.isLive) {
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
            } else {
                enemyTanks.remove(enemyTank);
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
    // 判断所有子弹和所有敌方坦克
    public void hitEnemyTank() {
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {
                for (int j = 0; j < enemyTanks.size(); j++) {
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(shot, enemyTank);
                }
            }
        }

    }
    // 判断敌人坦克是否击中我的坦克
    public void hitHero() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            // 取出敌人坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            // 遍历其所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                // 取出子弹
                Shot shot = enemyTank.shots.get(j);
                // 判断是否击中
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }

    // 判断我方的单个子弹是否击中敌方坦克
    public void hitTank(Shot shot, Tank tank) {
        // 判断击中坦克
        switch (tank.getDirect()) {
            case 0:
            case 2:
                if (shot.x > tank.getX() && shot.x < tank.getX() + 40 && shot.y > tank.getY() && shot.y < tank.getY() + 60) {
                    shot.isLive = false;
                    tank.isLive = false;
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3:
                if (shot.x > tank.getX() && shot.x < tank.getX() + 60 && shot.y > tank.getY() && shot.y < tank.getY() + 40) {
                    shot.isLive = false;
                    tank.isLive = false;
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
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
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }
        this.repaint();
        // 发射一颗子弹
//        if (e.getKeyCode() == KeyEvent.VK_J) {
//            // 判断子弹是否销毁
//            if (hero.shot == null || !hero.shot.isLive) {
//                hero.shotEnemyTank();
//            }
//        }
        // 发射多颗子弹
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
            hitEnemyTank();
            hitHero();
            this.repaint();
        }
    }
}
