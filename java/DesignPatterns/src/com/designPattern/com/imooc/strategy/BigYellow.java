package com.designPattern.com.imooc.strategy;

import com.designPattern.com.imooc.strategy.impl.FlyNoWay;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 10:55
 */
public class BigYellow extends Duck{
    public BigYellow() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我身体很大，全身黄黄");
    }
}
