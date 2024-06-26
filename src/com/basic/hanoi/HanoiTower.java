package com.basic.hanoi;

public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(5, 'A', 'B', 'C');
    }
}

class Tower {
    // num 表示要移动的个数 a,b,c分别表示三个塔
    public void move(int num, char a, char b, char c) {
        // 如果只有1个盘 num=1
        if (num == 1) {
            System.out.println(a + "->" + c);
        } else {
            // 如果有多个盘 可以看成两个 最下面的和上面的所有盘(num - 1)
            // (1) 先移动上面所有的盘到 b 借助 c
            move(num - 1, a, c, b);
            // (2) 把最下面的这个盘 移动到c
            System.out.println(a + "->" + c);
            // (3) 再把 b 的所有盘 移动到c 借助到a
            move(num - 1, b, a, c);
        }
    }
}