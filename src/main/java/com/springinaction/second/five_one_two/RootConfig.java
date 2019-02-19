package com.springinaction.second.five_one_two;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Auther: eros
 * @Date: 2019/2/15 11:46
 * @Description:
 */
@Configuration
@ComponentScan(basePackages = {"com.springinaction.second.five_one_two"},
excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
public class RootConfig {
}
