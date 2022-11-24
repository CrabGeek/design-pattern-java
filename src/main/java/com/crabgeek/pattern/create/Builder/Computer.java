package com.crabgeek.pattern.create.Builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Computer {
    private String type;
    private String cpu;
    private String ram;
    private String hardDisk;
    private String monitor;
    private String os;
}
