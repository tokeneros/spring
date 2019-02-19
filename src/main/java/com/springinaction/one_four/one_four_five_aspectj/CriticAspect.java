package com.springinaction.one_four.one_four_five_aspectj;

/**
 * @Auther: eros
 * @Date: 2019/2/15 10:10
 * @Description: 表演评论员
 */
public class CriticAspect {

    public CriticAspect() {
    }

//    定义切点
//    pointcut performance() : execution(* perform(..));

//    afterReturning() : performance(){
//        System.out.println(criticismEngine.getCriticism());
//    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
    public CriticismEngine getCriticismEngine() {
        return criticismEngine;
    }
}
