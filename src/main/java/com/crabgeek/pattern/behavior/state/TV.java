package com.crabgeek.pattern.behavior.state;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-03-26 15:03
 */
public class TV {
    public final static Channel CCTV1 = new CCTV1();
    public final static Channel CCTV2 = new CCTV2();

    private Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void disCCTV1() {
        this.setChannel(CCTV1);
        this.channel.display();
    }

    public void disCCTV2() {
        this.setChannel(CCTV2);
        this.channel.display();
    }
}
