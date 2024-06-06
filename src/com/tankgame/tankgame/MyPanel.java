package com.tankgame.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @author mzm
 * @version 1.0
 * 坦克大战的绘图区域
 */
public class MyPanel extends JPanel {
    // 定义我的坦克
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100, 100); // 初始化自己坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); // 填充矩形 默认黑色
        // 画出坦克 封装方法
        drawTank(hero.getX(), hero.getY(), g, 0, 0);
        drawTank(hero.getX() + 100, hero.getY(), g, 0, 1);
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
        }
    }
}
