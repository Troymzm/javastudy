package com.OOP.poly_.polyparameter_;

public class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("工人" + getName() + "正在工作");
    }

    @Override
    public double getAnnual() { // 直接调用父类方法
        return super.getAnnual();
    }
}
