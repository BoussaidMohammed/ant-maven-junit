package org.mql.maven;

import junit.framework.TestCase;

public class TestCaclculator2 extends TestCase {
	private Calculator c;
	
	@Override
	protected void setUp() throws Exception {
		c = new Calculator();
	}
	
	public void testAddition() {
		assertEquals(7, c.calc(3, 4, Calculator.ADDITION));
	}
}
