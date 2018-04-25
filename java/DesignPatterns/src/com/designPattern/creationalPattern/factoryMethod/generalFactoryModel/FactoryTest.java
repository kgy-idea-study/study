package com.designPattern.creationalPattern.factoryMethod.generalFactoryModel;

public class FactoryTest {
	public static void main(String[] args) {
		MyFactory factory = new MyFactory();
		MyInterface myi = factory.produce("One");
		myi.print();
	}
}
