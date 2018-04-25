package com.designPattern.creationalPattern.abstractFactory;

import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyInterface;

public class FactoryTest {
	public static void main(String[] args){ 
        Provider provider = new MyFactoryOne();
        MyInterface myi = provider.produce();
        myi.print();
    }
}
