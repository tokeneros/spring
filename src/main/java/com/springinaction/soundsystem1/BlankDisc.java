package com.springinaction.soundsystem1;

import java.util.List;

/**
 * @Auther: eros
 * @Date: 2019/1/29 15:39
 * @Description:
 */
public class BlankDisc implements CompactDisc {

    private String title;

    private String artist;

    private List<String> tracks;

    //使用setter方法进行赋值
    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks){
            System.out.println("-Track : " + track);
        }
    }
}
