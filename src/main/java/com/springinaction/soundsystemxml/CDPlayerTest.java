package com.springinaction.soundsystemxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: eros
 * @Date: 2019/1/29 16:07
 * @Description:
 */
public class CDPlayerTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("soundsystem.xml");
        MediaPlayer mediaPlayer = context.getBean(MediaPlayer.class);
        mediaPlayer.play();
        context.close();
    }

}
