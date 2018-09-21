package com.solab.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.solab.lib.SharedClass;

@SpringBootApplication
public class Service1Application {

    @Bean
    public SharedClass sharedClass(Environment env) {
        return new SharedClass(env.getProperty("shared.value", "default"));
    }

    @Bean
    public Other other() {
        return new Other();
    }

    public static void main(String... args) {
        SpringApplication.run(Service1Application.class, args);
    }
}
