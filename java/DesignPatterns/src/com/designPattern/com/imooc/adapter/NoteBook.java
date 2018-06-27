package com.designPattern.com.imooc.adapter;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/27 15:25
 */
public class NoteBook {
    private ThreePlugIf  plug;

    public NoteBook(ThreePlugIf plug){
        this.plug = plug;
    }

    //使用插座充电
    public void charge(){
        plug.powerWithThree();
    }

    public static void main(String[] args) {
        GBTwoPlug two =  new GBTwoPlug();
        ThreePlugIf three = new TwoPlugAdapter(two);
        NoteBook nb = new NoteBook(three);
        nb.charge();


        three = new TwoPlugAdapterExtends();
        nb = new NoteBook(three);
        nb.charge();

    }

}
