package com.superOOP.string_;

/**
 * @author mzm
 * @version 1.0
 */
public class StringBuilder01 {
    // 用于单线程 多线程应该用StringBuffer
    // 继承了 AbstractStringBuilder类
    // 实现了 Serializable 可串行化 (对象可以网络传输 可以保存到文件)
    // 是一个final类
    // 对象的字符序列仍然存放在 父类 AbstractStringBuilder 的 char[] value
    // 字符序列在堆中
    // 没有实现synchronized 即没有做互斥的处理 因此用于单线程
    // StringBuilder 的方法使用和 StringBuffer 一样
}
