package com.superOOP.bignum;

import java.math.BigInteger;

/**
 * @author mzm
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {
        // 当我们需要处理更大的整数时 long 不够用
        long l = 1323265641;
        System.out.println(l);
        // 可以使用 BigInteger
        BigInteger bigInteger = new BigInteger("1116261621616464974456");
        BigInteger bigInteger2 = new BigInteger("132326656979562644456");
        System.out.println(bigInteger);
        // 在对 BigInteger 进行加减乘除时 需要使用对应方法
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);
        BigInteger sub = bigInteger.subtract(bigInteger2);
        System.out.println(sub);
        BigInteger mul = bigInteger.multiply(bigInteger2);
        System.out.println(mul);
        BigInteger div = bigInteger.divide(bigInteger2);
        System.out.println(div);
    }
}
