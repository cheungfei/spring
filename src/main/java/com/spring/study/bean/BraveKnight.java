package com.spring.study.bean;

import java.util.Queue;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 11:44
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
