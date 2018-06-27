package com.designPattern.com.imooc.templateMethod;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/25 15:06
 */
/*
 * 具体子类，提供了咖啡制备的具体实现
 */
public class Coffee extends RefreshBeverage {
    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }
}
