package com.crabgeek.pattern.behavior.observer;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-12 14:55
 */
public class ObserverClient {
    public static void main(String[] args) {
        Button button = new Button();
        button.setColor("白色");
        button.setX(0);
        button.setY(0);
        button.addClickableObserver(new ChangeColorObserver());
        button.addClickableObserver(new ChangeCoordinateObserver());
        button.addClickableObserver(new OtherObserver());
        button.click();
        System.out.println(button);
    }
}
