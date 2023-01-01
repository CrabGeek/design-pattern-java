package com.crabgeek.pattern.behavior.command;

import javax.swing.*;
import java.awt.*;

public class RedCommand extends JButton implements MyCommand {

    private JPanel p;

    public RedCommand(String name, JPanel p) {
        super(name);
        this.p = p;
    }

    @Override
    public void execute() {
        p.setBackground(Color.RED);
    }
}
