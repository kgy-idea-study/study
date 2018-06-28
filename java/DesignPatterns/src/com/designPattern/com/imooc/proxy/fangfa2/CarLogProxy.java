package com.designPattern.com.imooc.proxy.fangfa2;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 15:48
 */
public class CarLogProxy implements Moveable{
    public CarLogProxy(Moveable m) {
        super();
        this.m = m;
    }

    private Moveable m;

    @Override
    public void move() {
        System.out.println("日志开始....");
        m.move();
        System.out.println("日志结束....");
    }
}
