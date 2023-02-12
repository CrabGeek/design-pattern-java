package com.crabgeek.pattern.behavior.observer;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-12 14:34
 */
public class ChangeCoordinateObserver implements ClickableObserver{
    @Override
    public void clicked(Clickable clickable) {
        Button b = (Button) clickable;
        b.setX(100);
        b.setY(90);
    }
}
