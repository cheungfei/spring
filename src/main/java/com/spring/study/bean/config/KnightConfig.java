package com.spring.study.bean.config;

import com.spring.study.bean.BraveKnight;
import com.spring.study.bean.Knight;
import com.spring.study.bean.Quest;
import com.spring.study.bean.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2022-01-03 15:57
 */
@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
