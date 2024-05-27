package com.advancedOOP.draw;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author mzm
 * @version 1.0
 * 演示如何在面板上画出圆形
 */
public class DrawCircle extends JFrame{ // JFrame 对应窗口
    // 定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle() { // 构造器
        // 初始化面板
        mp = new MyPanel();
        // 把面板放入到窗口
        this.add(mp);
        // 设置窗口大小
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 点击窗口的叉号时程序完全退出
        this.setVisible(true); // 可以显示
    }
}
// 1. 先定义一个MyPanel() 继承JPanel类
class MyPanel extends JPanel {
    // MyPanel 就是一个画板
    // Graphics g 把 g 理解成一支画笔
    // Graphics 提供了很多绘图方法
    @Override
    public void paint(Graphics g) { // 绘图方法
        super.paint(g); // 调用父类的方法完成初始化
        // 画一个圆
        g.drawOval(10, 10, 100, 100);

        // 演示绘制不同的图形
        // 画直线
        g.drawLine(10, 10, 100, 100);
        // 画矩形边框
        g.drawRect(10, 10, 100, 100);
        // 画椭圆边框
        g.drawOval(15, 15, 20, 25);
        // 填充矩形
        g.setColor(Color.blue);
        g.fillRect(25, 25, 85, 85);
        // 填充椭圆
        g.setColor(Color.red);
        g.fillOval(50, 50, 60, 85);
        // 画图片
        // 1. 获取图片资源
        URL imageURL;
        try {
            imageURL = new File("E:\\code\\image.png").toURI().toURL();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        Image image = Toolkit.getDefaultToolkit().getImage(imageURL);
        g.drawImage(image, 15, 15, 195, 108, this);
        // 画字符串
        // 给画笔设置颜色和字体
        g.setColor(Color.red);
        g.setFont(new Font("隶书", Font.BOLD, 50));
        g.drawString("你好", 100, 100); // 字符串的左下角
    }
}