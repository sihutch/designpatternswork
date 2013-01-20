package com.si.dp.structural.adaptor;

import static org.junit.Assert.*;
import org.junit.Test;

public class AdaptorTest {
	
	@Test
	public void testAdaptor() {
		String expected = Adaptee.SPECIFIC_REQUEST;
		Target target = new Adaptor();
		assertEquals(expected, target.getRequest());
	}
}