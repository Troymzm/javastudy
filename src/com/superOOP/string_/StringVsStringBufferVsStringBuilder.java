package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringVsStringBufferVsStringBuilder {
    /*
     * 使用原则
     * 如果字符串存在大量的修改操作 一般使用 StringBuffer 或者 StringBuilder
     * 如果字符串存在大量的修改操作 并在单线程的情况下 一般使用 StringBuilder
     * 如果字符串存在大量的修改操作 并在多线程的情况下 一般使用 StringBuffer
     * 如果我们的字符串很少修改 被多个对象引用 使用String 比如配置信息等
     */
    public static void main(String[] args) {
        String text = "";
        long startTime = 0L;
        long endTime = 0L;
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            buffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 200000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String " + (endTime - startTime));
    }
}
