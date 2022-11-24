package com.crabgeek.pattern.structual.adaptor;

public class ClientDemo {
    public static void main(String[] args) {
        Hundun hundun = new FoodAdapter();
        hundun.makeHundun();
    }
}
