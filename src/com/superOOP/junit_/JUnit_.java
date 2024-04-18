package com.superOOP.junit_;

import org.junit.Test;

/**
 * @author mzm
 * @version 1.0
 */
public class JUnit_ {
    public static void main(String[] args) {
        // 传统方式
        // new JUnit_().m1();
        // new JUnit_().m2();

    }
    @Test
    public void m1() {
        System.out.println("m1");
    }
    @Test
    public void m2() {
        System.out.println("m2");
    }
}
