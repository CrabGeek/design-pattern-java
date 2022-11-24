package com.crabgeek.pattern.create.factory.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Grape implements Fruit{
    private boolean seedless;

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }

    public boolean isSeedless() {
        return seedless;
    }

    @Override
    public void grow() {
        log.info("葡萄正在生长...");
    }

    @Override
    public void harvest() {
        log.info("收获葡萄");
    }

    @Override
    public void plant() {
        log.info("栽种葡萄");
    }
}
