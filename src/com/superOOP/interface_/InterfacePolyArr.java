package com.superOOP.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        // 多态数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            // 进行类型判断并进行向下转型
            if (usbs[i] instanceof Phone_) { // instanceof 判断运行类型
                ((Phone_) usbs[i]).call();
            }
        }
    }
}

interface Usb {
    void work();
}
class Phone_ implements Usb {
    public void call() {
        System.out.println("手机可以打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class Camera_ implements Usb {
    @Override
    public void work() {
        System.out.println("相机工作中");
    }
}