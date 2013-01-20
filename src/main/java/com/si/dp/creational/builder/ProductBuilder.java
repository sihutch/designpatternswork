package com.si.dp.creational.builder;

public interface ProductBuilder {
	
	public void buildName();
	public void buildDescription();
	public Product getProduct();
}