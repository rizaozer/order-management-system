package com.example.ordermanagementsystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.ordermanagementsystem.dao")
@PropertySource("classpath:/application.properties")
public class JpaConfig {

}
