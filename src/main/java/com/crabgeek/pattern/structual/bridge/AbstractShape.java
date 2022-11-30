package com.crabgeek.pattern.structual.bridge;

public abstract class AbstractShape {
    protected Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
