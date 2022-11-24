package com.crabgeek.pattern.structual.decorator;

// 奔驰车 （裸车，需要装饰）
public class Benz implements Car{
    @Override
    public void show() {
        System.out.println("奔驰车默认颜色是黑色");
    }
}
