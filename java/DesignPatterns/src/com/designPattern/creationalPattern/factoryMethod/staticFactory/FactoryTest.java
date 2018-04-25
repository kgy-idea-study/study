package com.designPattern.creationalPattern.factoryMethod.staticFactory;

import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyInterface;

public class FactoryTest {
	public static void main(String[] args) {
		MyInterface myi = MyFactory.produceOne();
		myi.print();
	}
}
