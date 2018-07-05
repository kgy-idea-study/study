package com.designPattern.com.imooc.cor;

import com.designPattern.com.imooc.cor.handler.PriceHandler;
import com.designPattern.com.imooc.cor.handler.PriceHandlerFactory;

import java.util.Random;

/**
 * 客户，请求折扣
 *
 * @author kouguangyuan
 * @date 2018/7/2 10:20
 */
public class Customer {
    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount) {
        priceHandler.processDiscount(discount);
    }


    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random rand = new Random();

        customer.requestDiscount(0.15f);

        int forLength = 100;
        for (int i = 1; i <= forLength; i++) {
            System.out.print(i + ":");
            customer.requestDiscount(rand.nextFloat());
        }


    }
}
