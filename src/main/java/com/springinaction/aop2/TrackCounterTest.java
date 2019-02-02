package com.springinaction.aop2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: eros
 * @Date: 2019/2/1 16:14
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class TrackCounterTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void testCD(){
        cd.playTrack(1);
    }

    @Autowired
    private TrackCounter trackCounter;

    @Test
    public void testTrackCounter(){
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(3);
        cd.playTrack(7);
        cd.playTrack(7);

        System.out.println(trackCounter.getPlayCount(1));
        System.out.println(trackCounter.getPlayCount(2));
        System.out.println(trackCounter.getPlayCount(3));
        System.out.println(trackCounter.getPlayCount(4));
        System.out.println(trackCounter.getPlayCount(5));
        System.out.println(trackCounter.getPlayCount(6));
        System.out.println(trackCounter.getPlayCount(7));
    }

}
