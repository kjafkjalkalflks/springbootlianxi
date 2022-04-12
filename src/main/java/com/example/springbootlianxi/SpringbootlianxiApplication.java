package com.example.springbootlianxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @EnableJpaAuditing注解表示启用JPA审计
 */
@SpringBootApplication
@EnableJpaAuditing//开启审计功能
public class SpringbootlianxiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootlianxiApplication.class, args);
        System.out.println(run);
    }

}
