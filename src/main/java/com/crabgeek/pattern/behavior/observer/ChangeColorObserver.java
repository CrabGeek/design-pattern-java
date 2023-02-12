package com.crabgeek.pattern.behavior.observer;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-12 14:32
 */
public class ChangeColorObserver implements ClickableObserver{
    @Override
    public void clicked(Clickable clickable) {
        Button b = (Button) clickable;
        b.setColor("红色");
    }
}
