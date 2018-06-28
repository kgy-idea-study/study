package com.designPattern.com.imooc.strategy;

import com.designPattern.com.imooc.strategy.impl.FlyWithWin;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 13:44
 */
public class RedheadDuck extends Duck{
    public RedheadDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
