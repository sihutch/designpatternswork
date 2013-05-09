package com.si.dp.creational.builder;

public class Director {

    private ProductBuilder productBuilder;

    public Director(final ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    public Product construct() {
        productBuilder.buildName();
        productBuilder.buildDescription();
        return productBuilder.getProduct();
    }
}