package com.crabgeek.pattern.create.Builder;

public interface ComputerBuilder {
    void buildCpu();
    void buildRam();
    void buildHardDisk();
    void buildGraphicCard();
    void buildMonitor();
    void buildOs();
    Computer getResult();
}
