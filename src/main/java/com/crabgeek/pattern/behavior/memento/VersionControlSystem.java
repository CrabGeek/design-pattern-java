package com.crabgeek.pattern.behavior.memento;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-15 22:46
 */
public class VersionControlSystem {
    private LinkedList<Backup> backups = new LinkedList<>();
    private int nextVersion;

    public void add(Backup backup) {
        backup.setVersion(nextVersion++);
        backups.add(backup);
    }

    public Backup get(int version) {
        for (Backup backup : backups) {
            if (backup.getVersion() == version) {
                return backup;
            }
        }
        return null;
    }

    public Backup getLastVersion() {
        return backups.getLast();
    }
}
