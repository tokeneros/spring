package com.springinaction.second.six;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.AbstractTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

/**
 * @Auther: eros
 * @Date: 2019/2/19 12:02
 * @Description:
 * 在Spring中使用Thymeleaf
 * 配置三个启用Thymeleaf与Spring集成的bean
 * 1.ThymeleafViewResolver —— 将逻辑视图名称解析成Thymeleaf模板视图
 * 2.SpringTemplateEngine —— 处理模板并渲染结果
 * 3.ITemplateResolver 的子类 —— 加载Thymeleaf模板
 */
@EnableWebMvc
@Configuration
@ComponentScan("com.springinaction.second.six.web")
public class WebConfig2 {

    // Thymeleaf视图解析器
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setContentType("text/html; charset=utf-8");
        viewResolver.setTemplateEngine(templateEngine);
        return viewResolver;
    }

    // 模板引擎
    @Bean
    public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver){
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }

    // 模板解析器
    @Bean
    public ITemplateResolver templateResolver(){
        WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
        ServletContextTemplateResolver  templateResolver = new ServletContextTemplateResolver(webApplicationContext.getServletContext());
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode("HTML5");
        return templateResolver;
    }

}
