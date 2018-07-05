package com.designPattern.com.imooc.cor.handler;

/**
 * 销售， 可以批准5%以内的折扣
 * @author kouguangyuan
 * @date 2018/7/2 10:04
 */
public class Sales extends PriceHandler{
    @Override
    public void processDiscount(float discount) {
        float f = 0.05f;
        if(discount <= f){
            System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(), discount);
        }else{
            successor.processDiscount(discount);
        }
    }
}
