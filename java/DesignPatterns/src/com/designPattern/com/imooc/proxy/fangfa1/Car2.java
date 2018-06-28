package com.designPattern.com.imooc.proxy.fangfa1;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 15:36
 */
public class Car2 extends Car{
    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶....");
        super.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶....  汽车行驶时间："
                + (endtime - starttime) + "毫秒！");
    }
}
