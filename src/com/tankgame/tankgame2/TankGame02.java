package com.tankgame.tankgame2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author mzm
 * @version 1.0
 */
public class TankGame02 extends JFrame {
    // 定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGame02();
    }
    public TankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setVisible(true);
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
