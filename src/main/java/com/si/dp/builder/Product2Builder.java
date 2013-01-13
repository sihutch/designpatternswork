package com.si.dp.builder;

public class Product2Builder implements ProductBuilder {
	
	Product product;
	
	public Product2Builder() {
		this.product = new Product();
	}
	
	@Override
	public void buildDescription() {
		product.setDescription("product2Description");
		
	}

	@Override
	public void buildName() {
		product.setName("product2Name");
	}

	@Override
	public Product getProduct() {
		return product;
	}
}