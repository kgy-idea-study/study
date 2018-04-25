package com.study;

@javax.jws.WebService
public class WebServiceImpl implements WebService {
    @Override
    public String sayHello(String name) {
        System.out.println("成功了哈哈哈哈！！！");

        return name + "hahahahaha";
    }
}
