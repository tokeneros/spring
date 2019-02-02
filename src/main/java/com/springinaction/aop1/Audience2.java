package com.springinaction.aop1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Auther: eros
 * @Date: 2019/2/1 15:18
 * @Description: 环绕通知方法
 */
@Aspect
public class Audience2 {

    @Pointcut("execution(* com.springinaction.aop1.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
