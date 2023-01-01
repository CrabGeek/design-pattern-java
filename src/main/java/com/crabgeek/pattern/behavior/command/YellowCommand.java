package com.crabgeek.pattern.behavior.command;

import javax.swing.*;
import java.awt.*;

public class YellowCommand extends JButton implements MyCommand{
    private JPanel p;

    public YellowCommand(String name, JPanel p) {
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        p.setBackground(Color.YELLOW);
    }
}
