package com.springinaction.advancedAssembly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @Auther: eros
 * @Date: 2019/1/30 14:46
 * @Description:
 */
@Configuration
@PropertySource("classpath:/advanced/app.properties")//可以
//@PropertySource("classpath:app.properties")//可以
//@PropertySource("app.properties")//可以
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc disc(){
//        return new BlankDisc(
//                env.getProperty("disc.title"),
//                env.getProperty("disc.artist")
//        );
        return new BlankDisc(// 如果找寻不到这个key，我们给其设置默认值
                env.getProperty("disc.title1","Rattle and Hum"),
                env.getProperty("disc.artist1","U2")
        );
    }

}
