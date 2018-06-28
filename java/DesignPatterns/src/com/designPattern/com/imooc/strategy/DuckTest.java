package com.designPattern.com.imooc.strategy;

/**
 * @Author : Admin
 * @Description :
 * @Date : 2018/6/28 13:51
 */
public class DuckTest {
    public static void main(String[] args){
        System.out.println("测试鸭子程序");
        System.out.println("************************");
        Duck duck = null;
//		duck = new MallardDuck();
//		duck = new RedheadDuck();
//		duck = new RubberDuck();
//		duck = new BigYellow();
        duck = new SpaceDuck();

        duck.display();
        duck.quack();
        duck.fly();
        System.out.println("************************");
        System.out.println("测试完毕");
    }
}
