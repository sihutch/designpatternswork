package com.si.dp.creational.abstractfactory;

public class ProductFactory2 implements ProductFactory {

	@Override
	public ProductA getProductA() {
		return new ProductA2();
	}

	@Override
	public ProductB getProductB() {
		return new ProductB2();
	}
}