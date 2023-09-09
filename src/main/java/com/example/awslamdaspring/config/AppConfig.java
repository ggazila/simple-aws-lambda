package com.example.awslamdaspring.config;

import com.example.awslamdaspring.service.DbService;
import com.example.awslamdaspring.service.impl.DbServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DbService dbService() {
        return new DbServiceImpl();
    }
}
