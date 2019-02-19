package com.springinaction.second.seven;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @Auther: eros
 * @Date: 2019/2/19 15:32
 * @Description:
 */
public class WebFilterInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 注册Filter
        FilterRegistration.Dynamic filter = servletContext.addFilter("myFilter",MyFilter.class);
        // 添加Filter的映射路径
        filter.addMappingForUrlPatterns(null,false,"/custom/*");
    }
}
