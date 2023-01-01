package com.crabgeek.pattern.behavior.command;

import javax.swing.*;

public class ExitCommand extends JButton implements MyCommand {

    public ExitCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
