package com.crabgeek.pattern.behavior.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-15 22:43
 */
public class Backup {
    @Getter
    @Setter
    private String content;

    @Getter
    @Setter
    private int version;

    public Backup(String content) {
        this.content = content;
    }
}
