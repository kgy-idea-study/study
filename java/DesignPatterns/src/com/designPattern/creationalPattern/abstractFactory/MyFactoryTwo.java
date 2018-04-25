package com.designPattern.creationalPattern.abstractFactory;

import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyClassTwo;
import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyInterface;

public class MyFactoryTwo implements Provider {

	@Override
	public MyInterface produce() {
		return new MyClassTwo();
	}

}
