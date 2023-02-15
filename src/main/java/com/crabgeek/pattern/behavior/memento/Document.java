package com.crabgeek.pattern.behavior.memento;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-15 22:38
 */
@Builder
public class Document {
    // 需要备份的状态
    @Getter
    @Setter
    private String content;

    // 不需要备份的状态
    @Getter
    @Setter
    private String otherContent;

    public Backup save() {
        System.out.println("保存备份");
        return new Backup(content);
    }

    public void resume(Backup backup) {
        System.out.println("恢复备份");
        this.content = backup.getContent();
    }

    @Override
    public String toString() {
        return "content:" + this.content + ", otherContent: " + otherContent;
    }
}
