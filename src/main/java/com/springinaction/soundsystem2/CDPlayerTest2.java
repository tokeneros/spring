package com.springinaction.soundsystem2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: eros
 * @Date: 2019/1/29 19:25
 * @Description:
 */
public class CDPlayerTest2 {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("cd_player_config.xml");
        MediaPlayer mediaPlayer = context.getBean(MediaPlayer.class);
        mediaPlayer.play();
        context.close();
    }

}
