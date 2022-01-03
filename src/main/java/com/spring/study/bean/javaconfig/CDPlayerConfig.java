package com.spring.study.bean.javaconfig;

import com.spring.study.bean.autoconfig.CDPlayer;
import com.spring.study.bean.autoconfig.CompactDisc;
import com.spring.study.bean.autoconfig.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 16:43
 */
@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

//    @Bean
//    public CDPlayer cdPlayer(CompactDisc compactDisc) {
//        return new CDPlayer(compactDisc);
//    }

    @Bean
    public CDPlayer cdPlayer() {
        return new CDPlayer(compactDisc());
    }
}
