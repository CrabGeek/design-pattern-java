package com.crabgeek.pattern.structual.decorator;

public class ConcreteCarDecorator extends CarDecorator{

    public ConcreteCarDecorator(Car car) {
        super(car);
    }

    private void print() {
        System.out.println("在车尾绘制`新手`字样，颜色是紫色霞光");
    }

    private void setGps() {
        System.out.println("安装GPS定位导航系统");
    }

    @Override
    public void show() {
        super.show();
        this.print();
        this.setGps();
    }
}
