package com.springinaction.second.six;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * @Auther: eros
 * @Date: 2019/2/19 09:32
 * @Description:
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.springinaction.second.six.web")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * @auther: eros
     * @param  1
     * @date: 2019/2/19 11:06
     * @description 布局引擎，定义适用
     * @return: org.springframework.web.servlet.view.tiles3.TilesConfigurer
     */
    @Bean
    public TilesConfigurer tilesConfigurer(){
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[]{
                "/WEB-INF/layout/tiles.xml"
                ,"/WEB-INF/views/**/tiles.xml"
        });
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }

    @Bean
    public ViewResolver viewResolver(){
        return new TilesViewResolver();
    }

//    @Bean
//    public ViewResolver viewResolver(){
//        InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
//        resourceViewResolver.setPrefix("/WEB-INF/views/");
//        resourceViewResolver.setSuffix(".jsp");
//        resourceViewResolver.setViewClass(JstlView.class);
//        return resourceViewResolver;
//    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        // 静态资源可访问
        configurer.enable();
    }

    //不知道为什么
    //http://localhost:8080/resources/images/spittr_logo_50.png
    //http://localhost:8080/resources/style.css
    //todo 静态资源总是找不到，目前先放着吧
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/**").addResourceLocations( "/images/");
        registry.addResourceHandler("/resources/**").addResourceLocations( "/resources/");
        super.addResourceHandlers(registry);
    }
}
