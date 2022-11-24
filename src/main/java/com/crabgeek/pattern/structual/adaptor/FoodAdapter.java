package com.crabgeek.pattern.structual.adaptor;

public class FoodAdapter extends ShuiJiao implements Hundun{
    @Override
    public void makeHundun() {
        super.makeShuiJiao();
        System.out.println("馄饨和水饺一样是以面包陷的食品");
    }
}
