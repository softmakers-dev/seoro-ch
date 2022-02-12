package com.softmakers.seoro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.softmakers.seoro")
public class SeoroApp {

    public static void main(String[] args) {
        SpringApplication.run(SeoroApp.class, args);
    }
}
