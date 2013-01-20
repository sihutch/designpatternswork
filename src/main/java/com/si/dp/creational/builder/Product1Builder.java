package com.si.dp.creational.builder;

public class Product1Builder implements ProductBuilder {
	
	Product product;
	
	public Product1Builder() {
		this.product = new Product();
	}
	
	@Override
	public void buildDescription() {
		product.setDescription("product1Description");
		
	}

	@Override
	public void buildName() {
		product.setName("product1Name");
	}

	@Override
	public Product getProduct() {
		return product;
	}
}