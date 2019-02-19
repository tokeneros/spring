package com.springinaction.aop3;

import com.springinaction.aop2.TrackCounterConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: eros
 * @Date: 2019/2/15 09:54
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class AopTest {

    @Test
    public void test(){
        EncoreableIntroducer.encoreable.performEncore();
    }

}
