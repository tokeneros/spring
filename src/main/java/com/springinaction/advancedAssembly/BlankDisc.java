package com.springinaction.advancedAssembly;

/**
 * @Auther: eros
 * @Date: 2019/1/29 15:39
 * @Description:
 */
public class BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
