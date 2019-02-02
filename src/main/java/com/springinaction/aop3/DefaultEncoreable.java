package com.springinaction.aop3;

/**
 * @Auther: eros
 * @Date: 2019/2/1 16:34
 * @Description:
 */
public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("DefaultEncoreable");
    }
}
