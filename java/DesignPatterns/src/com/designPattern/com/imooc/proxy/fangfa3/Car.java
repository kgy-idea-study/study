package com.designPattern.com.imooc.proxy.fangfa3;

import java.util.Random;

/**
 * @author admin
 * @see Moveable
 * @date 2018/6/28 17:08
 */
public class Car implements Moveable{
    @Override
    public void move() {
        //实现开车
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
