package com.springinaction.second.seven;

import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Auther: eros
 * @Date: 2019/2/19 15:27
 * @Description:
 */
public class WebServletInitializer implements WebApplicationInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 注册Servlet
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("myServlet",MyServlet.class);
        // 映射Servlet
        dynamic.addMapping("/custom/**");
    }

}
