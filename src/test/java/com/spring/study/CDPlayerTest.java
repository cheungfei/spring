package com.spring.study;

import com.spring.study.bean.autoconfig.CDPlayerConfig;
import com.spring.study.bean.autoconfig.CompactDisc;
import com.spring.study.bean.autoconfig.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 16:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
//        player.play();
//        assertEquals(
//                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n",
//                log.getLog());
//        System.out.println("console print log info: [" + log.getLog() + "]");
//        assertEquals("Playing", log.getLog());
//        assertEquals("Playing", systemOutRule.getLog());

        System.out.print("hello world");
        assertEquals("hello world", systemOutRule.getLog());
    }
}
