package com.springinaction.soundsystem2;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: eros
 * @Date: 2019/1/29 19:24
 * @Description:
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.compactDisc = cd;
    }

    @Override
    public void play() {
        compactDisc.play();
    }

}
