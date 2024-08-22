package com.telenor.nova.star;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    private static ConfigurableApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        applicationContext = application.run(args);
    }

    public static void stop() {
        SpringApplication.exit(applicationContext);
    }
}
