package com.crabgeek.pattern.create.factory.general;

public class ConcreteCreator implements Creator{
    @Override
    public <T extends Product> T factory(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
