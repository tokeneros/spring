package com.springinaction.soundsystem2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: eros
 * @Date: 2019/1/29 19:35
 * @Description:
 */
@Configuration
public class CDConfig {

//    @Bean
//    public CompactDisc compactDisc(){
//        return new SgtPeppers();
//    }

    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
