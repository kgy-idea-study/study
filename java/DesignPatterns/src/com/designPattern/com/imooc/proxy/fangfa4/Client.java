package com.designPattern.com.imooc.proxy.fangfa4;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 17:43
 */
public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {

        CglibProxy proxy = new CglibProxy();
        Train t = (Train)proxy.getProxy(Train.class);
        t.move();
    }
}
