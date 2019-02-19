package com.springinaction.one_four.one_four_five_aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: eros
 * @Date: 2019/2/15 11:12
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/four/criticism.xml")
public class AspectTest {

    @Autowired
    ApplicationContext context;

    // java.lang.IllegalStateException: Failed to load ApplicationContext
//    @Autowired
//    private CriticAspect criticAspect;

    @Test
    public void injectAspectJ(){
        CriticAspect criticAspect = (CriticAspect) context.getBean("criticAspect");
        System.out.println(criticAspect.getCriticismEngine().getCriticism());
    }

}
