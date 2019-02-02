package com.springinaction.knights.config;

import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Knight;

import com.springinaction.knights.Quest;
import com.springinaction.knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: eros
 * @Date: 2019/1/28 14:21
 * @Description:
 * 这里DI使用了两种方式的注入
 * 1.使用xml bean 来进行操作
 * 2.使用注解来 （推荐）
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
