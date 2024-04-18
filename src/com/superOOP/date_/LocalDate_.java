package com.superOOP.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author mzm
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {
        // 第三代日期
        // 使用now() 返回表示当前时间的对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());

        LocalDate now = LocalDate.now(); // 只有年月日
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());

        LocalTime now2 = LocalTime.now(); // 只有时分秒
        System.out.println(now2.getHour());
        System.out.println(now2.getMinute());
        System.out.println(now2.getSecond());

        // 格式化类似于SimpleDateFormat
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss EEE");
        String format = dtf.format(ldt);
        System.out.println(format);

        // 提供 plus 方法 和 minus 方法 对当前时间进行加或者减
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println(dtf.format(localDateTime));
        LocalDateTime localDateTime_1 = ldt.minusMinutes(890);
        System.out.println(dtf.format(localDateTime_1));
    }
}
