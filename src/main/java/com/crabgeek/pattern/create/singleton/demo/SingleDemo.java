package com.crabgeek.pattern.create.singleton.demo;

public class SingleDemo {

    public static void main(String[] args) {
        NumThread threadA = new NumThread("线程A");
        NumThread threadB = new NumThread("线程B");

        threadA.start();
        threadB.start();
    }
}

class NumThread extends Thread {
    private String threadName;

    public NumThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        GlobalNum globalNum = GlobalNum.getInstance();

        for (int i = 0; i < 5; i++) {
            System.out.println(this.threadName + "第" + globalNum.getNum() + "次访问!");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
