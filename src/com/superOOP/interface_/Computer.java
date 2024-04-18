package com.superOOP.interface_;

public class Computer {
    // UsbInterface usbInterface 形参是接口类型 UsbInterface 看到 接收 实现了 UsbInterface 接口的类的对象实例
    public void work(UsbInterface usbInterface) {
        // 通过接口调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
