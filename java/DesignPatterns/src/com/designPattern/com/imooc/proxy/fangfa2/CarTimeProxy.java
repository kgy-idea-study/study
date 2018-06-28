package com.designPattern.com.imooc.proxy.fangfa2;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 15:48
 */
public class CarTimeProxy implements Moveable{
    public CarTimeProxy(Moveable m) {
        super();
        this.m = m;
    }

    private Moveable m;

    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        m.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }
}
