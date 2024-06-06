package com.tankgame.tankgame3;

import javax.swing.*;

/**
 * @author mzm
 * @version 1.0
 */
public class TankGame03 extends JFrame {
    // 定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGame03();
    }
    public TankGame03() {
        mp = new MyPanel();
        // 将mp放入到Thread并启动
        new Thread(mp).start();
        this.add(mp);
        this.addKeyListener(mp);
        this.setVisible(true);
        this.setSize(1050, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
