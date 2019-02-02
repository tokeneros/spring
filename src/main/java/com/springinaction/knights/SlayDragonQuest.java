package com.springinaction.knights;

import java.io.PrintStream;

/**
 * @Auther: eros
 * @Date: 2019/1/28 13:56
 * @Description:
 */
public class SlayDragonQuest implements Quest{

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
