package com.crabgeek.pattern.behavior.command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JPanel p;
    private YellowCommand btnYellow;
    private RedCommand btnRed;
    private ExitCommand btnExit;

    public MyFrame() {
        super("命令模式");
        p = new JPanel();

        this.add(p);

        btnYellow = new YellowCommand("黄色", p);
        btnRed = new RedCommand("红色", p);
        btnExit = new ExitCommand("退出");

        p.add(btnYellow);
        p.add(btnRed);
        p.add(btnExit);

        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
        btnExit.addActionListener(this);

        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyCommand obj = (MyCommand) e.getSource();
        obj.execute();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
