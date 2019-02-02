package com.springinaction.soundsystem1;

/**
 * @Auther: eros
 * @Date: 2019/1/29 17:03
 * @Description:
 */
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt . Pepper's Lonely Hearts Club Band";

    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
