package com.springinaction.soundsystem;

import org.springframework.stereotype.Component;

//import javax.inject.Named;

/**
 * @Auther: eros
 * @Date: 2019/1/28 15:36
 * @Description:
 */
@Component(value = "lonelyHeartsClub")
//或者
//@Named("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt . Pepper's Lonely Hearts Club Band";

    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
