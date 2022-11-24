package com.crabgeek.pattern.create.factory.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Apple implements Fruit{

    private int treeAge;

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    public int getTreeAge() {
        return treeAge;
    }

    @Override
    public void grow() {
        log.info("苹果正在生长...");
    }

    @Override
    public void harvest() {
        log.info("收获苹果");
    }

    @Override
    public void plant() {
        log.info("种植苹果");
    }
}
