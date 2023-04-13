package com.izumi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.izumi.mapper")
@EnableScheduling
@EnableSwagger2
public class IzumiBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(IzumiBlogApplication.class, args);
    }
}
