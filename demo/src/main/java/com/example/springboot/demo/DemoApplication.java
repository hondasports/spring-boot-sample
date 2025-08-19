package com.example.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner verifyDbConnection(JdbcTemplate jdbcTemplate) {
        return args -> {
            try {
                Integer one = jdbcTemplate.queryForObject("SELECT 1", Integer.class);
                log.info("DB connectivity check succeeded: SELECT 1 -> {}", one);
            } catch (Exception e) {
                log.error("DB connectivity check failed", e);
            }
        };
    }
}
