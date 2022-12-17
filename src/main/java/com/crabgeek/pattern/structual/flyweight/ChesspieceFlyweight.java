package com.crabgeek.pattern.structual.flyweight;

public class ChesspieceFlyweight implements Chesspiece{

    private String color;

    public ChesspieceFlyweight(String color) {
        this.color = color;
    }

    @Override
    public void put(int x, int y) {
        System.out.println("在 (" + x + "," + y + ") 位置放置了一个" + color + "子");
    }
}
