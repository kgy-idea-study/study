package com.example.springbootaxis.webservice;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldWebService implements HelloWorldRemote{

    @Autowired
    private HelloWorldBean helloWorldBean;

    @Override
    public String getMessage(String name) {
        return helloWorldBean.getMessage(name);
    }

}
