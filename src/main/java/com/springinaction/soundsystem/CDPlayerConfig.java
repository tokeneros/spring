package com.springinaction.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: eros
 * @Date: 2019/1/28 15:40
 * @Description:
 * 如果没有其他配置的话，@ComponentScan默认会扫描与配置类相同的包。
 * 在这里会扫描到 SgtPeppers
 *
 * @Configuration 表明这是一个配置泪
 */
@Configuration
//@ComponentScan("com.springinaction.soundsystem")
//@ComponentScan(basePackages = "com.springinaction.soundsystem")
//@ComponentScan(basePackageClasses = SgtPeppers.class)
public class CDPlayerConfig {

    // name 默认与方法名称一致
    @Bean(name = "lonelyHeartsClub")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

//    @Bean()
//    public MediaPlayer cdPlayer(){
//        return new CDPlayer(sgtPeppers());
//    }

    //相较于上面的那个方法，这样不限定于只存在一个方法
    @Bean
    public MediaPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }

}
