package com.springinaction.soundsystemxml;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: eros
 * @Date: 2019/1/29 16:10
 * @Description:
 */
public class CDPlayer implements MediaPlayer{

    private CompactDisc compactDisc;

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    @Override
    public void play() {
        compactDisc.play();
    }

}
