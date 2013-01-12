package com.si.dp.abstractfactory;

import static org.junit.Assert.*;
import org.junit.Test;

public class AbstractFactoryTest {
	
	@Test
	public void testProductFactory1() {
		ProductFactory factory = new ProductFactory1();
		assertEquals(ProductA1.class, factory.getProductA().getClass());
		assertEquals(ProductB1.class, factory.getProductB().getClass());
	}
	
	@Test
	public void testProductFactory2() {
		ProductFactory factory = new ProductFactory2();
		assertEquals(ProductA2.class, factory.getProductA().getClass());
		assertEquals(ProductB2.class, factory.getProductB().getClass());
	}
}