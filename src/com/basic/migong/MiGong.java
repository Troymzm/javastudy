package com.basic.migong;

public class MiGong {
    public static void main(String[] args) {
        /*
         * 思路
         * 1. 先创建迷宫 用二维数组表示 int[][] map = new int[8][7];
         * 2. 先规定 map 数组的元素值 0表示可以走 1表示障碍物
         * 3. 将最上面一行和最下面一行全部设置为1
         * 4. 将最右面和最左面一列全部设置为1
         */
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;

        Mouse mouse = new Mouse();
        if (mouse.findWay(map, 1, 1)) {
            System.out.println("============");
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}

class Mouse {
    /*
     * 使用递归回溯的思想解决老鼠出迷宫
     * 1. findWay方法就是专门找出迷宫的路径
     * 2. 如果找到 就返回true 否则返回false
     * 3. map 就是二维数组 即表示迷宫
     * 4. i,j就是老鼠的位置 初始化位置为(1,1)
     * 5. 因为我们是递归的找路 所以我们先规定map数组的各个值的含义
     * 0 表示可以走 1 表示障碍物 2 已经走过表示可以走 3 表示走过 但是走不通是死路
     * 6. 当map[6][5] = 2 说明找到通路 就可以结束 否则就继续找
     * 7. 先确定老鼠的找路策略 下-右-上-左
     */
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                // 假定可以走通
                map[i][j] = 2;
                // 使用找路策略 来确定该位置是否真的可以走通
                // 下-右-上-左
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    // 改变找路策略
    public boolean findWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                // 假定可以走通
                map[i][j] = 2;
                // 使用找路策略 来确定该位置是否真的可以走通
                // 上-右-下-左
                if (findWay2(map, i - 1, j)) {
                    return true;
                } else if (findWay2(map, i, j + 1)) {
                    return true;
                } else if (findWay2(map, i + 1, j)) {
                    return true;
                } else if (findWay2(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
