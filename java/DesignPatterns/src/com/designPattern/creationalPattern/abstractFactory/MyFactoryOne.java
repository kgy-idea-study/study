package com.designPattern.creationalPattern.abstractFactory;

import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyClassOne;
import com.designPattern.creationalPattern.factoryMethod.generalFactoryModel.MyInterface;

public class MyFactoryOne implements Provider {

	@Override
	public MyInterface produce() {
		return new MyClassOne();
	}

}
