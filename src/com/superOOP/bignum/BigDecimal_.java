package com.superOOP.bignum;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author mzm
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        // 当我们需要保存一个精度很高的数时 double 不够用
        double d = 1999.616231316464626595;
        System.out.println(d);
        // 可以使用 BigDecimal
        BigDecimal bigDecimal = new BigDecimal("1999.616231316464626595");
        System.out.println(bigDecimal);
        // 不能直接相加减
        BigDecimal bigDecimal2 = new BigDecimal("2999.616231316464626595");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        System.out.println(add);
        BigDecimal sub = bigDecimal.subtract(bigDecimal2);
        System.out.println(sub);
        BigDecimal mul = bigDecimal.multiply(bigDecimal2);
        System.out.println(mul);
        // ArithmeticException : Non-terminating decimal expansion 除不尽可能抛出异常
        // 需要指定精度
        BigDecimal div = bigDecimal.divide(bigDecimal2, RoundingMode.CEILING); // 或者BigDecimal.CEILING
        System.out.println(div);
    }
}
