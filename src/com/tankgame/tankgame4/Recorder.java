package com.tankgame.tankgame4;

import java.io.*;
import java.util.Vector;

/**
 * @author mzm
 * @version 1.0
 * 用于记录相关信息
 */
public class Recorder {
    // 定义变量 记录我方击毁敌人坦克数
    private static int allEnemyTankNum = 0;
    // 定义IO对象
    private static BufferedWriter bufferedWriter = null;
    private static BufferedReader bufferedReader = null;
    private static String recordFile = "src\\com\\tankgame\\tankgame4\\myRecord.txt";
    private static Vector<EnemyTank> enemyTanks = null;

    // 定义一个Node的Vector用于保存敌人坦克信息
    private static Vector<Node> nodes = new Vector<>();

    // 读取文件 恢复相关信息 在继续上局游戏时候调用
    public static Vector<Node> getNodesAndEnemyTankRecord() {
        try {
            bufferedReader = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(bufferedReader.readLine());
            // 循环读取文件生成 nodes 集合
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));
                nodes.add(node);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return nodes;
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    public static String getRecordFile() {
        return recordFile;
    }

    // 当我方击毁一辆坦克就allEnemyTankNum++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }

    // 退出游戏时 保存allEnemyTankNum及敌人坦克的坐标和方向到文件中
    public static void keepRecord() {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(recordFile));
            bufferedWriter.write(String.valueOf(allEnemyTankNum));
            bufferedWriter.newLine();
            // 遍历敌人坦克的Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                // 取出敌人坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {
                    // 保存该敌人坦克的信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    bufferedWriter.write(record);
                    bufferedWriter.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }
}
