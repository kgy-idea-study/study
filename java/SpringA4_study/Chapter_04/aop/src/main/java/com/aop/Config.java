package com.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author kouguangyuan
 * @date 2018/7/12 14:08
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class Config {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance performance(){
        return new PerformanceImpl();
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
