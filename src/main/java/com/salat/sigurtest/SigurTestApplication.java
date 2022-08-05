package com.salat.sigurtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SigurTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SigurTestApplication.class, args);
    }

}
