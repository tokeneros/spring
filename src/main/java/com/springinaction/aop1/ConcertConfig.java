package com.springinaction.aop1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Auther: eros
 * @Date: 2019/2/1 15:03
 * @Description:
 *
 * @EnableAspectJAutoProxy 启用AspectJ自动代理
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

//    @Bean
//    public Audience audience(){
//        return new Audience();
//    }

    @Bean
    public Audience2 audience(){
        return new Audience2();
    }

}
