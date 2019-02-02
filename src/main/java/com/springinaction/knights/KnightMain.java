package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: eros
 * @Date: 2019/1/28 14:26
 * @Description:
 * 通过xml来创建spring上下文，然后获取使用，这就是DI的一种使用方式
 *
 * Spring 自带了多种类型的应用上下文
 * 1.AnnotationConfigApplicationContext:从一个或多个基于java的配置类中加载Spring应用上下文
 * 在指定的文件系统路径下查找knight.xml
 * 2.AnnotationConfigWebApplicationContext:从一个或多个基于java的配置类中加载spring web 应用上下文
 * 3.ClassPathXmlApplicationContext:从类路径下的一个或多个XML配置文件中加载上下文定义，把应用上下文的定义文件作为类资源
 * 在所有的类路径（包含JAR文件）下查找knight.xml
 * 4.FilSystemXmlApplicationContext:从文件系统下的一个或多个XML配置文件中加载上下文定义
 * 5.XmlWebApplicationContext:从Web应用下的一个或多个XML配置文件中加载上下文定义
 */
public class KnightMain {

    public static void main(String[] args){
        // 1. 加载Spring上下文
        // 加不加classpath 都一样
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("knights.xml");
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(com.springinaction.knights.config.KnightConfig.class);
        // 2. 获取knight bean
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
