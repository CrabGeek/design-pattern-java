package com.crabgeek.pattern.create.Builder;

public class X201Builder implements ComputerBuilder{

    private X201 computer = new X201();

    @Override
    public void buildCpu() {
        computer.setCpu("i3-350");
    }

    @Override
    public void buildRam() {
        computer.setRam("2GB 1333MHz");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("250GB 5400转");
    }

    @Override
    public void buildGraphicCard() {

    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("12英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows7 Home版");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
