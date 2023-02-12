package com.crabgeek.pattern.behavior.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-12 13:37
 */
public class Button implements Clickable{

    private List<ClickableObserver> observers = new ArrayList<>();

    @Getter
    @Setter
    private String color;

    @Getter
    @Setter
    private int x, y;

    @Override
    public void click() {
        System.out.println("按钮被单击");

        for (int i = observers.size() - 1; i >=0 ; i--) {
            observers.get(i).clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeClickableObserver(ClickableObserver observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        return "按钮颜色: " + color + ", 坐标: " + x + ", " + y;
    }
}
