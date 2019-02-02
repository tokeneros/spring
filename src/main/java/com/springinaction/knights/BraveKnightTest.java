package com.springinaction.knights;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * @Auther: eros
 * @Date: 2019/1/28 12:14
 * @Description:
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);//注入mock Quest
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();//限制只执行一次
    }
}
