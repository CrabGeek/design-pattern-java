package com.crabgeek.pattern.create.singleton;

import java.util.Objects;

public class SingletonLazy {
    private static SingletonLazy _instance = null;

    private SingletonLazy() {

    }

    public synchronized static SingletonLazy getInstance() {
        if (Objects.isNull(_instance)) {
            _instance = new SingletonLazy();
        }
        return _instance;
    }
}
