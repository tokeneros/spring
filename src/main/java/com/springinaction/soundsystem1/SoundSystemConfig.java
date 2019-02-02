package com.springinaction.soundsystem1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: eros
 * @Date: 2019/1/29 17:09
 * @Description:
 */
@Configuration
@Import({CDPlayerConfig.class})
@ImportResource("classpath:cd_config.xml")
public class SoundSystemConfig {
}
