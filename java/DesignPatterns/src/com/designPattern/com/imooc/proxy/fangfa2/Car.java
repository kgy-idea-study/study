package com.designPattern.com.imooc.proxy.fangfa2;

import com.designPattern.com.imooc.proxy.fangfa2.Moveable;

import java.util.Random;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 15:48
 */
public class Car implements Moveable {
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
