package com.designPattern.com.imooc.adapter;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/27 15:23
 */
/*
 * 二相转三相的插座适配器
 */

public class TwoPlugAdapter implements ThreePlugIf{

    private GBTwoPlug plug;

    public TwoPlugAdapter(GBTwoPlug plug){
        this.plug = plug;
    }

    @Override
    public void powerWithThree() {
        System.out.println("通过转化");
        plug.powerWithTwo();
    }
}
