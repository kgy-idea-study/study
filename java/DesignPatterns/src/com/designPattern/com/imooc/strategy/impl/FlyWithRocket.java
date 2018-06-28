package com.designPattern.com.imooc.strategy.impl;

import com.designPattern.com.imooc.strategy.FlyingStragety;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 11:24
 */
public class FlyWithRocket implements FlyingStragety {
    @Override
    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }
}
