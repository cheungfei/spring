package com.spring.study.bean;

import java.io.PrintStream;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 12:17
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
