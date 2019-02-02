package com.springinaction.knights;

/**
 * @Auther: eros
 * @Date: 2019/1/28 12:14
 * @Description:
 */
public class BraveKnight implements Knight{

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }

}
