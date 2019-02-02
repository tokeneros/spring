package com.springinaction.aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: eros
 * @Date: 2019/2/1 15:46
 * @Description:
 */
@Aspect
public class TrackCounter {

    private Map<Integer,Integer> trackCounts = new HashMap<Integer, Integer>();

    // 通知playTrack()方法
    @Pointcut("execution(* com.springinaction.aop2.CompactDisc.playTrack(int)) && args(number)")
    public void trackPlayed(int number){};

    // 在播放前，为该磁道计数
    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ?
                trackCounts.get(trackNumber) : 0;
    }

}
