package com.designPattern.com.imooc.strategy;

import com.designPattern.com.imooc.strategy.impl.FlyWithWin;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 11:28
 */
public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }
    public MallardDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }
}
