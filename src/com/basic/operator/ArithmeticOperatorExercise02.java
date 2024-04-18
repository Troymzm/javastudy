package com.basic.operator;

public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        // 1. 需求 假如还有59天放假 问 合 xx 个星期零 xx 天
        // 2. 思路分析 使用 int 变量 days 保存 天数 一个星期是7天 
        // 星期数weeks: days / 7 零 xx 天 leftDays days % 7
        // 输出
        // 3. 走代码
        int days = 59;
        int weeks = days / 7;
        int leftDays = days % 7;
        System.out.println(days + "天 合" + weeks + "星期零" + leftDays + "天");

        // 1. 需求
        // 定义一个变量保存华氏温度 华氏温度转换摄氏温度的公式为 5 / 9 * (华氏温度 - 100), 求出华氏温度对应的摄氏温度

        // 2. 思路分析
        // 先定义一个 double huaShi 变量保存 华氏温度
        // 根据给出的公式进行计算 -- 考虑数学公式和java语言的特性
        // 将得到的结果保存到 double sheShi
        double huaShi = 234.6;
        double sheShi = 5.0 / 9 * (huaShi - 100);
        System.out.println("华氏温度" + huaShi + "对应的摄氏温度" + sheShi);

    }
}
