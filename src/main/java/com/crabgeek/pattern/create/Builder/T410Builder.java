package com.crabgeek.pattern.create.Builder;

public class T410Builder implements ComputerBuilder{
    private T410 computer = new T410();
    @Override
    public void buildCpu() {
        computer.setCpu("i5-450");
    }

    @Override
    public void buildRam() {
        computer.setRam("4GB 1333MHz");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("500GB 7200转");
    }

    @Override
    public void buildGraphicCard() {
        computer.setGraphicCard("Nvidia NVS 3100M");
    }

    @Override
    public void buildMonitor() {
        computer.setMonitor("14 英寸 1280*800");
    }

    @Override
    public void buildOs() {
        computer.setOs("Windows 7 旗舰版");
    }

    @Override
    public Computer getResult() {
        return this.computer;
    }
}
