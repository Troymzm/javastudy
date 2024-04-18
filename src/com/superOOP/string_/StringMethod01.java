package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        // 1. equals 区分大小写
        String str1 = "hello";
        String str2 = "com.basic.hello_.Hello";
        System.out.println(str1.equals(str2));
        // 2. equalsIgnoreCase 忽略大小写判断内容是否相等
        System.out.println(str1.equalsIgnoreCase(str2));
        // 3. length 获取字符串长度
        System.out.println(str1.length());
        // 4. indexOf 获取字符或字符串在字符串对象中第一次出现的位置 找不到返回-1
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.indexOf("t"));
        System.out.println(str1.indexOf("el"));
        System.out.println(str1.indexOf("et"));
        // 5. lastIndexOf 获取字符在字符串对象中最后一次出现的位置 找不到返回-1
        System.out.println(str1.lastIndexOf("el"));
        System.out.println(str1.lastIndexOf("et"));
        // 6. substring 截取指定范围内的子串
        System.out.println(str1.substring(2)); // 截取后面的字符
        System.out.println(str1.substring(0,3)); // 从0开始截取到3
        System.out.println(str1.substring(1,3)); // 从1开始截取到3
        // 7. toUpperCase 转换成大写
        System.out.println(str1.toUpperCase());
        // 8. toLowerCase 转换成小写
        System.out.println(str1.toLowerCase());
        // 9. concat 拼接字符串
        System.out.println(str1.concat(str2));
        // 10. replace 替换字符串中的字符 但str1本身没有被更改
        System.out.println(str1.replace("el", "12"));
        System.out.println(str1);
        // 11. split 分割字符串 对于某些分割字符 需要转义字符
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        String[] strings = poem.split(","); // 以 , 为标准对poem进行分割
        for (String i : strings) {
            System.out.println(i);
        }
        String str3 = "E:\\aaa\\bbb";
        String[] strings_1 = str3.split("\\\\"); // 转义字符
        for (String i : strings_1) {
            System.out.println(i);
        }
        // 12. toCharArray 转换成字符数组
        char[] chars = str1.toCharArray();
        for (char i : chars) {
            System.out.println(i);
        }
        // 13. compareTo 字符串比较 前者大返回正数 后者大返回负数 相等返回0
        String a = "jac";
        String b = "jack";
        System.out.println(a.compareTo(b));
        String c = "jack";
        System.out.println(b.compareTo(c));
        System.out.println(b.compareTo(a));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        // 字符串1的第一个字符跟字符串2的第一个字符不相等，则两个字符串都按照第一个字符的ASCII码顺序进行比较，其他字符都不用看，并返回一个整型
        // 字符串1的第一个字符如果跟字符串2的第一个字符相等，那么就以两个字符串的第二个字符开始比较，如果还是相等就以第三个字符开始比较……以此类推，直到两个字符串中出现不一样的字符时再比较双方的字典顺序。
        // 如果两个字符串的前几位字符都相同，但字符串2比字符串1多几位字符，那么就以字符串的长度进行比较
        // 14 format 格式字符串
        String name = "john";
        int age = 10;
        double score = 99.5;
        char gender = '男';
        String info = String.format("我的名字是%s 年龄是%d 成绩是%.2f 性别是%c", name, age, score, gender);
        System.out.println(info);
        String formatStr = "我的名字是%s 年龄是%d 成绩是%.2f 性别是%c";
        String info_1 = String.format(formatStr, name, age, score, gender);
        System.out.println(info_1);
    }
}
