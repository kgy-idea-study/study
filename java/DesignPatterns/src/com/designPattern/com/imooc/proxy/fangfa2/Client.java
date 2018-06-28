package com.designPattern.com.imooc.proxy.fangfa2;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 15:48
 */
public class Client {
    /**
     * 测试类
     */
    public static void main(String[] args) {
        Car car = new Car();
        CarLogProxy clp = new CarLogProxy(car);
        CarTimeProxy ctp = new CarTimeProxy(clp);
        ctp.move();
    }
}
