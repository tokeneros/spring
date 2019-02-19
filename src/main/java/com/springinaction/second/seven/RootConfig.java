package com.springinaction.second.seven;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Auther: eros
 * @Date: 2019/2/19 09:45
 * @Description:
 */@Configuration
@ComponentScan(basePackages = {"com.springinaction.second.seven"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
        })
public class RootConfig {
}
