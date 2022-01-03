package com.spring.study;

import com.spring.study.bean.BraveKnight;
import com.spring.study.bean.Quest;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 12:07
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
//        verify(mockQuest, times(1)).embark();
        verify(mockQuest, times(0)).embark();
    }
}
