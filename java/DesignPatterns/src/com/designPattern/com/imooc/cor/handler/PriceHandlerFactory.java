package com.designPattern.com.imooc.cor.handler;

/**
 *
 * @author kouguangyuan
 * @date 2018/7/2 10:04
 */
public class PriceHandlerFactory {
    /**
     * 创建PriceHandler的工厂方法
     */
    public static PriceHandler createPriceHandler() {

        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(lead);
        lead.setSuccessor(man);
        man.setSuccessor(dir);
        dir.setSuccessor(vp);
        vp.setSuccessor(ceo);

        return sales;
    }
}
