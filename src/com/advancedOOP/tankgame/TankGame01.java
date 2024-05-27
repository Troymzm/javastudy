package com.advancedOOP.tankgame;

import javax.swing.*;

/**
 * @author mzm
 * @version 1.0
 */
public class TankGame01 extends JFrame {
    // 定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGame01();
    }
    public TankGame01() {
        mp = new MyPanel();
        this.add(mp);
        this.setVisible(true);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
