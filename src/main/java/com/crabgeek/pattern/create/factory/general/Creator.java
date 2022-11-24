package com.crabgeek.pattern.create.factory.general;

public interface Creator {
    public <T extends Product> T factory(Class<T> c);
}
