package com.springinaction.aop3;

import org.aspectj.lang.annotation.*;

/**
 * @Auther: eros
 * @Date: 2019/2/1 13:52
 * @Description: 观看演出的切面
 *
 * @Aspect 表示不仅仅是一个POJO,还是一个切面
 * @After 通知方法会在目标方法返回或抛出异常后调用
 * @AfterReturning 通知方法会在目标方法但会后调用
 * @AfterThrowing 通知方法会在目标方法抛出异常后调用
 * @Around 通知方法会将目标方法封装起来
 * @Before 通知方法会在目标方法调用之前执行
 * @Pointcut 定义命名的切点
 */
@Aspect
public class Audience {

    @Pointcut("execution(* com.springinaction.aop1.Performance.perform(..))")
    public void performance(){}

    // 表演之前
    @Before("performance()")
    public void silenceCellPhone(){
        System.out.println("Silence cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    //表演之后
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!");
    }

    //表演失败之后
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }

}
