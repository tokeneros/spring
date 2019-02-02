package com.springinaction.soundsystem1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: eros
 * @Date: 2019/1/29 17:03
 * @Description:
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
