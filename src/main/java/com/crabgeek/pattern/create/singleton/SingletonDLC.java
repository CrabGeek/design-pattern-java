package com.crabgeek.pattern.create.singleton;

import java.util.Objects;

public class SingletonDLC {
    private static volatile SingletonDLC _instance;

    private SingletonDLC() {
    }

    public static SingletonDLC getInstance() {
        if (Objects.isNull(_instance)) {
            synchronized (SingletonDLC.class) {
                if (Objects.isNull(_instance)) {
                    _instance = new SingletonDLC();
                }
            }
        }
        return _instance;
    }
}
