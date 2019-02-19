package com.springinaction.second.seven;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * @Auther: eros
 * @Date: 2019/2/19 14:58
 * @Description:
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * @auther: eros
     * @param registration 1
     * @date: 2019/2/19 14:59
     * @description
     * 在AbstractAnnotationConfigDispatcherServletInitializer将DispatcherServlet
     * 注册到Servlet容器中之后，就会调用customizeRegistration(),将Servlet注册后得到的Registration.Dynamic传递进来
     * 。通过重载customizeRegistration方法，我们可以对DispatcherServlet进行额外的配置
     * @return: void
     */
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//      将上传文件的临时存储目录设置在“/tmp/spittr/uploads”
        registration.setMultipartConfig(
                new MultipartConfigElement("/tmp/spittr/uploads")
        );
    }

    /**
     * @auther: eros
     * @param  1
     * @date: 2019/2/19 15:36
     * @description
     * 如果注册Filter，并且Filter只会映射到DispatcherServlet上
     * 可以重载此方法
     * @return: javax.servlet.Filter[]
     */
//    @Override
//    protected Filter[] getServletFilters() {
//        return new Filter[] { new MyFilter()};
//    }
}
