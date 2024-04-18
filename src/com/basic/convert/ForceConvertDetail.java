package com.basic.convert;

public class ForceConvertDetail {
    public static void main(String[] args) {
        // 强转符号只针对于最近的操作数有效 往往会用小括号提升优先级
        int y = (int)(10 * 3.5 + 6 * 1.5);
        System.out.println(y);

        char c1 = 100;
        int m = 100;
        // char c2 = m 报错
        char c2 = (char)m;
        System.out.println(c1);
        System.out.println(c2);
    }
}
