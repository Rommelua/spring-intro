package com.spring.intro.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.spring.intro"})
public class AppConfig {
    @Bean
    public SessionFactory getSessionFactory() {
        return new org.hibernate.cfg.Configuration().configure()
                .buildSessionFactory();
    }
}
