package com.izumi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.izumi.mapper")
@EnableScheduling
public class IzumiBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(IzumiBlogApplication.class, args);
    }
}
