package com.springinaction.soundsystem1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: eros
 * @Date: 2019/1/29 17:04
 * @Description:
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
