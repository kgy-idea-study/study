package com.designPattern.com.imooc.strategy.impl;

import com.designPattern.com.imooc.strategy.FlyingStragety;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 11:26
 */
public class FlyWithWin implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
