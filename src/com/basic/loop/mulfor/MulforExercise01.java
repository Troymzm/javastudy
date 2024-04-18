package com.basic.loop.mulfor;

import java.util.Scanner;

public class MulforExercise01 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner myScanner = new Scanner(System.in);
        double average_grade = 0.0;
        double sum_grade = 0.0;
        double score = 0.0;
        double sum_grade_all = 0.0;
        double average_grade_all = 0.0;
        int pass_num = 0;
        int pass_num_all = 0;
        for (int i = 1; i < 4; i++) {
            sum_grade = 0.0;
            pass_num = 0;
            for (int j = 1; j < 6; j++) {
                System.out.println("请输入第" + i + "个班第" + j + "个学生的成绩");
                score = myScanner.nextDouble();
                sum_grade += score;
                if (score >= 60) {
                    pass_num++;
                }
            }
            average_grade = sum_grade / 5;
            System.out.println("第" + i + "个班的总分为" + sum_grade + "\n平均分为" + average_grade + "\n及格人数为" + pass_num);
            sum_grade_all += sum_grade;
            pass_num_all += pass_num;
        }
        average_grade_all = sum_grade_all / 15;
        System.out.println("所有学生的总分为" + sum_grade_all + "\n平均分为" + average_grade_all + "\n及格人数为" + pass_num_all);
    }
}
