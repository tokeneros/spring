package com.springinaction.soundsystem2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: eros
 * @Date: 2019/1/29 19:25
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:cd_player_config.xml")
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Test
    public void play() {
        player.play();
    }


//    public static void main(String[] args){
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("cd_player_config.xml");
//        MediaPlayer mediaPlayer = context.getBean(MediaPlayer.class);
//        mediaPlayer.play();
//        context.close();
//    }

}
