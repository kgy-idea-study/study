package com.designPattern.com.imooc.strategy;

import com.designPattern.com.imooc.strategy.impl.FlyNoWay;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 13:46
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全身发黄，嘴巴很红");
    }

    @Override
    public void quack(){
        System.out.println("嘎~嘎~嘎~");
    }
}
