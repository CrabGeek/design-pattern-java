package com.crabgeek.pattern.create.singleton;

public class SingletonHungry {
    private static SingletonHungry m_instance = new SingletonHungry();

    // 构造方法私有，保证外界无法直接实例化
    private SingletonHungry() {

    }
    // 通过该方法获得实例对象
    public static SingletonHungry getInstance() {
        return m_instance;
    }
}
