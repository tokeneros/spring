package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: eros
 * @Date: 2019/1/28 16:00
 * @Description:
 */
@Component
public class CDPlayer implements MediaPlayer{

    private CompactDisc cd;

    //添加required = false 会得到下列警告
    //Inconsistent constructor declaration on bean with name 'CDPlayer': single autowire-marked constructor flagged as optional - this constructor is effectively required since there is no default constructor to fall back to: public com.springinaction.soundsystem.CDPlayer(com.springinaction.soundsystem.CompactDisc)
    @Autowired(required = false)
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}
