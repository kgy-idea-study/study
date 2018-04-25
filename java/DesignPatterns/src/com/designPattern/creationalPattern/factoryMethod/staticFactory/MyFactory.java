package com.designPattern.creationalPattern.factoryMethod.staticFactory;

import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyClassOne;
import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyClassTwo;
import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyInterface;

public class MyFactory {
	public static MyInterface produceOne() {
		return new MyClassOne();
	}

	public static MyInterface produceTwo() {
		return new MyClassTwo();
	}
}
