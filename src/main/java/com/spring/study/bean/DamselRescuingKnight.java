package com.spring.study.bean;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 11:24
 *
 * damsel
 * 英 [ˈdæmzl]  美 [ˈdæmzl]
 * n. 少女；年轻女人；落难女子
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
