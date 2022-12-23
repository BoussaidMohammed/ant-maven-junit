package org.mql.maven.junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mql.maven.Calculator;


public class TestExcepetion {
	private Calculator cal;
	@Before
	public void init() {
		cal = new Calculator();
	}

	
	@Test(expected = java.lang.ArithmeticException.class)//(expected = NullPointerException.class)
	public void operation() {
		assertEquals(4, cal.calc(4,0 , Calculator.DIVISION));
	}
}
