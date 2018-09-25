package com.solab.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.solab.lib.SharedClass;
import com.solab.service1.Other;
import com.solab.service1.ComponentOne;

@SpringBootApplication
public class Service2Application {

    @Bean
    public SharedClass sharedClass(Environment env) {
        return new SharedClass(env.getProperty("shared.value", "default"));
    }
    @Bean
    public ComponentOne componentOne() {
        return new ComponentOne();
    }
    @Bean
    public Other other() {
        return new Other();
    }

    public static void main(String... args) {
        SpringApplication.run(Service2Application.class, args);
    }
}
