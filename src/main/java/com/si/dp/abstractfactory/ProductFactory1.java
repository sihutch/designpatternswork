package com.si.dp.abstractfactory;

public class ProductFactory1 implements ProductFactory {

	@Override
	public ProductA getProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB1();
	}
}
