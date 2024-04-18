package com.superOOP.system_;

import java.util.Arrays;

/**
 * @author mzm
 * @version 1.0
 */
public class System_ {
    public static void main(String[] args) {
        // arraycopy 复制数组元素 （源数组, 源数组起始位置, 目标数组, 把源数组的数据拷贝到 目标数组的哪个索引, 从源数组拷贝多少个数据到目标数组）
        int[] src = {1, 2, 3};
        int[] dest = new int[3];
        System.arraycopy(src,0, dest, 0, src.length); // 数组不能越界
        System.out.println(Arrays.toString(dest));

        // currentTimeMillis 返回当前时间至1970年1月1日0时0分的毫秒数
        System.out.println(System.currentTimeMillis());

        // exit 退出当前程序
        System.out.println("ok1");
        // exit(0)  表示程序正常退出
        System.exit(0);
        System.out.println("ok2");
    }
}
