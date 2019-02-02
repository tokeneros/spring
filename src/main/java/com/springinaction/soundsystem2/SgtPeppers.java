package com.springinaction.soundsystem2;
/**
 * @Auther: eros
 * @Date: 2019/1/28 15:36
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
