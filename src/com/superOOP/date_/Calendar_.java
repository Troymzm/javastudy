package com.superOOP.date_;

import java.util.Calendar;

/**
 * @author mzm
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        // Calender是一个抽象类 并且构造器是private
        // 可以通过 getInstance 来获取实例
        // 提供了大量的方法和字段
        // 如果需要24h Calendar.HOUR -> Calendar.HOUR_OF_DAY
        Calendar c = Calendar.getInstance(); // 创建日历类对象
        System.out.println(c);
        // 获取日历对象的某个日历字段
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1); // 月默认从0开始 需要+1
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        // Calender 没有专门的格式化方法 需要自己组合显示
        String format = "%d年%d月%d日";
        System.out.println(String.format(format, c.get(Calendar.YEAR), (c.get(Calendar.MONTH) + 1), c.get(Calendar.DAY_OF_MONTH)));
    }
}
