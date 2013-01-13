package com.si.dp.builder;

import static org.junit.Assert.*;
import org.junit.Test;

public class BuilderTest {
	
	@Test 
	public void testProductBuilder1() {
		Product product = new Director(new Product1Builder()).construct();
		assertEquals("product1Name", product.getName());
		assertEquals("product1Description", product.getDescription());
	}
	
	@Test 
	public void testProductBuilder2() {
		Product product = new Director(new Product2Builder()).construct();
		assertEquals("product2Name", product.getName());
		assertEquals("product2Description", product.getDescription());
	}
}