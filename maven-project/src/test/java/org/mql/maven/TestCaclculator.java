package org.mql.maven;

import junit.framework.TestCase;

public class TestCaclculator extends TestCase {
	private Calculator c;
	
	@Override
	protected void setUp() throws Exception {
		c = new Calculator();
	}
	
	public void testMultiplication() {
		assertEquals(12, c.calc(3, 4, Calculator.MULTIPLICATION));
	}
}
