package com.springinaction.aop1;

import org.springframework.stereotype.Component;

/**
 * @Auther: eros
 * @Date: 2019/2/1 15:09
 * @Description:
 */
@Component
public class Sing implements Performance {

    @Override
    public void perform() {
        System.out.println("sing");
    }

}
