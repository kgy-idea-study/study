package com.designPattern.creationalPattern.factoryMethod.multipleFactoryMethod;

import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyInterface;

public class FactoryTest {
	public static void main(String[] args) {
		MyFactory factory = new MyFactory();
		MyInterface myi = factory.produceOne();
		myi.print();
	}
}
