package com.advancedOOP.event_;

import com.OOP.modifier.B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author mzm
 * @version 1.0
 * 演示小球通过键盘控制上下左右的移动
 */
public class BallMove extends JFrame{ // 窗口
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        // 窗口对象可以监听键盘事件 即可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
// 面板 可以画出小球
// KeyListener 是监听器 可以监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    // 为了让小球可以移动 将左上角坐标设为变量
    int x  = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }

    // 有字符输出时该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 当某个键按下 该方法会触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char)(e.getKeyCode()) + "被按下");
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {  // VK_DOWN 向下箭头对应的asc码
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }
        this.repaint(); // 重绘
    }

    // 当某个键释放 该方法触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}