package com.zum.mobile.ci.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class TestappApplication {

    private final Logger logger =  Logger.getLogger(this.getClass().getName());

    public static void main(String[] args) {
        SpringApplication.run(TestappApplication.class, args);
    }

    @PostConstruct
    public void start() {
        logger.info("################################################");
        logger.info("!! PostConstruct In TestAppApplication!!");
        logger.info("################################################");
    }

}
