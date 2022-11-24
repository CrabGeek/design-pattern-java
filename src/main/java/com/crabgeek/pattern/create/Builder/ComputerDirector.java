package com.crabgeek.pattern.create.Builder;

public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public T410 constructT410() {
        computerBuilder = new T410Builder();
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildHardDisk();
        computerBuilder.buildGraphicCard();
        computerBuilder.buildMonitor();
        computerBuilder.buildOs();
        return (T410) computerBuilder.getResult();
    }

    public X201 constructX201() {
        computerBuilder = new X201Builder();
        computerBuilder.buildCpu();
        computerBuilder.buildRam();
        computerBuilder.buildHardDisk();
        computerBuilder.buildMonitor();
        computerBuilder.buildOs();
        return (X201) computerBuilder.getResult();
    }
}
