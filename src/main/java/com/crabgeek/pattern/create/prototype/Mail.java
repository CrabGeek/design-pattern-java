package com.crabgeek.pattern.create.prototype;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String appellation;
    private String context;
    private String tail;

    public Mail(String subject, String context) {
        this.subject = subject;
        this.context = context;
    }

    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
