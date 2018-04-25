package com.study;

import javax.xml.ws.Endpoint;

public class WebServicePublish {
    public static void main(String[] args) {
        String address = "http://localhost:8989/WS_Server/Webservice";
        Endpoint.publish(address,new WebServiceImpl());
        System.out.println("发布webservice成功");
    }
}
