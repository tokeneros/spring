package com.springinaction.aop2;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: eros
 * @Date: 2019/2/1 15:50
 * @Description:
 */
@Component
public class BlankDisc implements CompactDisc{

    private String title;

    private String artist;

    private List<String> tracks;

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
    public void playTrack(int trackNumber) {
        System.out.println(trackNumber);
    }

}
