package com.crabgeek.pattern.behavior.observer;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-12 14:54
 */
public class OtherObserver implements ClickableObserver{
    @Override
    public void clicked(Clickable clickable) {
        System.out.println("执行其他操作...");
    }
}
