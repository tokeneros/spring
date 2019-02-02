package com.springinaction.advancedAssembly;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: eros
 * @Date: 2019/1/30 14:50
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class AdvancedTest {

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void play(){
        compactDisc.play();
    }

}
