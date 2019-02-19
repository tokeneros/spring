package com.springinaction.one_four.one_four_five_aspectj;

/**
 * @Auther: eros
 * @Date: 2019/2/15 11:03
 * @Description:
 */
public class CriticismEngineImpl implements CriticismEngine{

    public CriticismEngineImpl() {
    }

    private String[] criticismPool;

    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

}
