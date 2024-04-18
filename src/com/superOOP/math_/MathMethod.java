package com.superOOP.math_;

/**
 * @author mzm
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        // Math 常用方法(静态方法)
        // 1. abs 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);
        // 2. pow 求幂
        double pow = Math.pow(2, 4);
        System.out.println(pow);
        // 3. ceil 向上取整 返回大于等于该参数的最小整数转成double
        double ceil = Math.ceil(-3.14);
        System.out.println(ceil);
        // 4. floor 向下取整 返回小于等于该参数的最大整数转成double
        double floor = Math.floor(-3.14);
        System.out.println(floor);
        // 5. round 四舍五入
        long round = Math.round(-3.14);
        System.out.println(round);
        // 6. sqrt 开方
        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);
        // 7. random 求随机数 返回 [0 , 1) 之间的随机小数
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
        for (int i = 0; i < 10; i++) {
            // 返回 [a, b] 之间的随机整数 (int)(a + (b - a + 1) * Math.random)
            System.out.println((int) ((7 - 2 + 1) * Math.random() + 2));
        }
        // max, min
        int min = Math.min(1,9);
        int max = Math.max(1,9);
        System.out.println(max);
        System.out.println(min);

    }
}
