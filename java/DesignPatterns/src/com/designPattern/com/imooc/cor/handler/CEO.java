package com.designPattern.com.imooc.cor.handler;

import static javafx.scene.input.KeyCode.L;

/**
 * CEO， 可以批准55%以内的折扣
 * 折扣超出55%， 就拒绝申请
 *
 * @author kouguangyuan
 * @date 2018/7/2 10:03
 */
public class CEO extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        float f = 0.55f;
        if (discount <= f) {
            System.out.format("%s批准了折扣:%.2f%n", this.getClass().getName(), discount);
        } else {
            System.out.format("%s拒绝了折扣:%.2f%n", this.getClass().getName(), discount);
        }
    }
}
