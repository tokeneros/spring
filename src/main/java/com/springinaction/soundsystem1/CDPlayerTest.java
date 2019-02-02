package com.springinaction.soundsystem1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: eros
 * @Date: 2019/1/29 17:08
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void play(){
        player.play();
    }

    @Test
    public void play2(){
        compactDisc.play();
    }

}
