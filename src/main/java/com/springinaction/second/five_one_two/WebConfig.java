package com.springinaction.second.five_one_two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @Auther: eros
 * @Date: 2019/2/15 11:46
 * @Description:
 * 需要配置哪些
 * 1.视图解析器
 * 2.组件扫描
 * 3.
 */
@Configuration
@EnableWebMvc //启用Spring MVC
@ComponentScan("com.springinaction.second.five_one_two.web") //启用组件扫描
public class WebConfig extends WebMvcConfigurerAdapter{

    /**
     * @auther: eros
     * @date: 2019/2/15 13:33
     * @description 配置JSP视图解析器
     * @return: org.springframework.web.servlet.ViewResolver
     * Spring 定义了一个名为ViewResolver 和 View的接口
     * 并且自带了13个视图解析器
     * BeanNameViewResolver —— 将视图解析为Spring应用上下文中的bean，其中bean的ID与视图的名称一致
     * ContentNegotiatingViewResolver —— 通过
     */
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resourceViewResolver
                = new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/views/");
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setExposeContextBeansAsAttributes(true);
        return resourceViewResolver;
    }

    /**
     * @auther: eros
     * @param configurer 1
     * @date: 2019/2/15 13:37
     * @description 配置静态资源的处理
     * 将对静态资源的请求转发到Servlet容器默认的Servlet上
     * ，而不是使用DispatcherServlet本身来处理此类请求
     * @return: void
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
