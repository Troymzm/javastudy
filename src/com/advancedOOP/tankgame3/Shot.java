package com.advancedOOP.tankgame3;

/**
 * @author mzm
 * @version 1.0
 */
public class Shot implements Runnable{
    int x; // 子弹x坐标
    int y; // 子弹y坐标
    int direct = 0; // 子弹方向
    int speed = 2; // 子弹速度
    boolean isLive = true; // 子弹是否存活
    // 构造器

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() { // 射击
        while (true) {
            // 线程休眠 50 ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // 根据方向改变xy坐标
            switch (direct) {
                case 0: // 上
                    y -= speed;
                    break;
                case 1: // 右
                    x += speed;
                    break;
                case 2: // 下
                    y += speed;
                    break;
                case 3: // 左
                    x -= speed;
                    break;
            }
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750)) {
                isLive = false;
                break;
            }
        }
    }
}
