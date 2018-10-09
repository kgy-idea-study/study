package com.example.springbootaxis.config;

import com.example.springbootaxis.webservice.HelloWorldBean;
import com.example.springbootaxis.webservice.HelloWorldWebService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kouguangyuan
 * @date 2018/10/9 17:18
 */
@Configuration
public class Config {

    @Bean
    public HelloWorldBean helloWorldBean(){
       return new HelloWorldBean();
    }

    @Bean
    public HelloWorldWebService helloWorldWebService(){
        return new HelloWorldWebService();
    }
}
