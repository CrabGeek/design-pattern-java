package com.crabgeek.pattern.create.singleton.demo;

import java.util.Objects;

public class GlobalNum {
    private static volatile GlobalNum gn;
    private int num = 0;

    private GlobalNum() {
    }

    public static GlobalNum getInstance() {
        if (Objects.isNull(gn)) {
            synchronized (GlobalNum.class) {
                if (Objects.isNull(gn)) {
                    gn = new GlobalNum();
                }
            }
        }
        return gn;
    }

    public synchronized int getNum() {
        num++;
        return num;
    }
}
