package com.study.springbootcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootControllerApplication {
    // 在Java类中创建 logger 实例
    private static final Logger logger = LoggerFactory.getLogger(SpringbootControllerApplication.class);

    // 在方法中使用日志输出，如
    public static void logTest() {
        logger.debug("日志输出测试 Debug");
        logger.trace("日志输出测试 Trace");
        logger.info("日志输出测试 Info");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootControllerApplication.class, args);
        logTest();
}

}
