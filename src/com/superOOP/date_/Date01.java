package com.superOOP.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date(); // 获取当前系统时间
        System.out.println(d1);

        // 创建 SimpleDateFormat 对象 可以指定相应格式
        // 格式使用的字母是规定好的
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE");
        String format = sdf.format(d1);
        System.out.println(format);

        // 通过指定毫秒数得到时间
        Date d2 = new Date(System.currentTimeMillis());
        System.out.println(d2.getTime()); // 获取某个时间对应的毫秒数
        System.out.println(sdf.format(d2));

        // 可以把一个格式化的字符串转成对应的date 日期格式一定要正确
        String s = "2024年04月13日 21:11:12 周六";
        Date parse = sdf.parse(s);
        System.out.println(sdf.format(parse));
    }
}