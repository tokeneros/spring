package com.springinaction.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: eros
 * @Date: 2019/1/29 16:38
 * @Description:
 */
@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }

}
