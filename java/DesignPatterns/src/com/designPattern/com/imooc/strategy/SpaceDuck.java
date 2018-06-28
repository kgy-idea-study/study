package com.designPattern.com.imooc.strategy;

import com.designPattern.com.imooc.strategy.impl.FlyWithRocket;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 13:47
 */
public class SpaceDuck extends Duck{
    public SpaceDuck() {
        super();
        super.setFlyingStragety(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔");
    }

    @Override
    public void quack(){
        System.out.println("我通过无线电与你通信");
    }
}
