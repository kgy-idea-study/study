package com.designPattern.creationalPattern.factoryMethod.multipleFactoryMethod;

import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyClassOne;
import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyClassTwo;
import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyInterface;

public class MyFactory {
	public MyInterface produceOne() {
		return new MyClassOne();
	}

	public MyInterface produceTwo() {
		return new MyClassTwo();
	}
}
