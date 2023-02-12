package com.crabgeek.pattern.behavior.observer;

public interface Clickable {
    void click();

    void addClickableObserver(ClickableObserver observer);

    void removeClickableObserver(ClickableObserver observer);
}
