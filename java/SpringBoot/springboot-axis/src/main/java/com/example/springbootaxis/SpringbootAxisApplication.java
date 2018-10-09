package com.example.springbootaxis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootAxisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAxisApplication.class, args);
    }
}
