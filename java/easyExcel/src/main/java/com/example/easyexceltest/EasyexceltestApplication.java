package com.example.easyexceltest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.exit;

@SpringBootApplication
public class EasyexceltestApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(EasyexceltestApplication.class);

    public static void main(String[] args) {
        //disabled banner, don't want to see the spring logo
        SpringApplication app = new SpringApplication(EasyexceltestApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

    }

    // Put your logic here.
    @Override
    public void run(String... args) throws Exception {
        System.out.println("fsadfasdfsdfdsf");
        LOGGER.error("dffsdfdsssssssssssssssssssssssssssssssss");
        exit(0);
    }

}
