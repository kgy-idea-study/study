package com.designPattern.com.imooc.cor.handler;

/**
 * 销售总监， 可以批准40%以内的折扣
 *
 * @author kouguangyuan
 * @date 2018/7/2 10:03
 */
public class Director extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        float f = 0.4f;
        if (discount <= f) {
            System.out.format("%s批准了折扣:%.2f%n", this.getClass().getName(), discount);
        } else {
            successor.processDiscount(discount);
        }
    }
}
