package com.fiora.study.bean.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "database")
public class DatabaseProperties {
    @Data
    public static class Server {
        private String ip;
        private String port;
    }

    private String username;
    private String password;
    private Server server;
}