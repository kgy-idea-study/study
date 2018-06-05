package com.study.sbfilterandlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SbFilterandlistenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbFilterandlistenerApplication.class, args);
    }
}
