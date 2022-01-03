package com.spring.study.bean.autoconfig;

import org.springframework.stereotype.Component;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 16:38
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
//        System.out.println("Playing " + title + " by " + artist);
        System.out.println("Playing");
    }
}
