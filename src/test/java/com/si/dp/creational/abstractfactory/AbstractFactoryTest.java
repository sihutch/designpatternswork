package com.si.dp.creational.abstractfactory;

import static org.junit.Assert.*;
import org.junit.Test;

import com.si.dp.creational.abstractfactory.ProductA1;
import com.si.dp.creational.abstractfactory.ProductA2;
import com.si.dp.creational.abstractfactory.ProductB1;
import com.si.dp.creational.abstractfactory.ProductB2;
import com.si.dp.creational.abstractfactory.ProductFactory;
import com.si.dp.creational.abstractfactory.ProductFactory1;
import com.si.dp.creational.abstractfactory.ProductFactory2;

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