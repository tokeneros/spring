//package com.springinaction.second.five_one_two;
//
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
///**
// * @Auther: eros
// * @Date: 2019/2/15 11:37
// * @Description: 将DispatcherServlet配置在Servlet容器中
// */
//public class SpittrWebAppInitializer
//    extends AbstractAnnotationConfigDispatcherServletInitializer{
//
//    // 制定配置类
//    // 理解DispatcherServlet和ContextLoaderListener 监听器
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class<?>[]{ RootConfig.class};
//    }
//
//    // 当DispatcherServlet启动时，它会创建Spring应用上下文
//    // ，并加载配置文件或配置类中所声明的bean。
//    // 这里我们要求在加载应用上下文时，使用定义在WebConfig配置类中的bean，如控制器、试图解析器、处理器映射
//    // Spring Web应用中，通常还会有另一个应用上下文，由ContextLoaderListener
//    // 加载应用中的其他bean，这些bean通常是驱动应用后端的中间层和数据层组件
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[]{ WebConfig.class};
//    }
//
//    // 将DispatcherServlet 映射到 ”/"
//    // 将一个或多个路径映射到DispatcherServlet，
//    // 这里，他映射的是'/'，表示它会是应用默认的Servlet
//    // 会处理进入应用的所有请求
//    @Override
//    protected String[] getServletMappings() {
//        return new String[] { "/" };
//    }
//}
