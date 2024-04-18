package com.superOOP.interface_;
// Phone 类 实现 UsbInterface 即 Phone 类 需要实现UsbInterface 接口 规定或声明的方法
public class Phone implements UsbInterface {
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
