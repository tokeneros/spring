package com.springinaction.aop1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: eros
 * @Date: 2019/2/1 15:11
 * @Description:
 */
public class ConcertXmlTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("concert.xml");
        Performance performance = context.getBean(Performance.class);
        performance.perform();
        context.close();
    }

}
