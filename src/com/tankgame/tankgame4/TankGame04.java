package com.tankgame.tankgame4;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @author mzm
 * @version 1.0
 */
public class TankGame04 extends JFrame {
    // 定义一个MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        new TankGame04();
    }
    public TankGame04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入选择 1: 新游戏 2: 继续上局");
        String key = scanner.next();
        mp = new MyPanel(key);
        // 将mp放入到Thread并启动
        new Thread(mp).start();
        this.add(mp);
        this.addKeyListener(mp);
        this.setVisible(true);
        this.setSize(1300, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 添加关闭窗口时间处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
