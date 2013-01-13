package com.si.dp.builder;

public class Director {

	private ProductBuilder productBuilder;

	public Director(ProductBuilder productBuilder) {
		this.productBuilder = productBuilder;
	}

	public Product construct() {
		productBuilder.buildName();
		productBuilder.buildDescription();
		return productBuilder.getProduct();
	}
}