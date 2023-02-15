package com.crabgeek.pattern.behavior.memento;

/**
 * @program: design-pattern-java
 * @description:
 * @author: Guipeng.Xie
 * @create: 2023-02-15 22:51
 */
public class MementoClient {
    public static void main(String[] args) {
        VersionControlSystem versionControlSystem = new VersionControlSystem();
        Document document = Document.builder()
                .content("content1")
                .otherContent("otherContent1")
                .build();
        System.out.println(document);

        versionControlSystem.add(document.save());

        document.setContent("content2");
        document.setOtherContent("otherContent2");
        System.out.println(document);

        versionControlSystem.add(document.save());

        document.setContent("content3");
        document.setOtherContent("otherContent3");
        System.out.println(document);

        document.resume(versionControlSystem.get(1));
        System.out.println(document);

        document.resume(versionControlSystem.getLastVersion());
        System.out.println(document);

    }
}
