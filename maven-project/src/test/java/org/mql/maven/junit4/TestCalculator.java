package org.mql.maven.junit4;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mql.maven.Calculator;

@RunWith(Parameterized.class)
public class TestCalculator {
	private int a;
	private int b;
	private int op;
	private int exepectedValue;
	private Calculator c;
	
	
	public TestCalculator(int a, int b, int op, int exepectedValue) {
		super();
		this.a = a;
		this.b = b;
		this.op = op;
		this.exepectedValue = exepectedValue;
	}
	
	@Parameters
	public static Collection<Object[]> args(){
		return Arrays.asList(new Object[][]{
				{1, 2, Calculator.ADDITION, 3},
				{3, 5, Calculator.MULTIPLICATION, 15},
				{8, 1, Calculator.SOUSTRACTION, 7}
		});
	}


	@Before
	public void setup() {
		c = new Calculator();
	}
	
	@Test
	public void methode() {
		assertEquals(exepectedValue, c.calc(a, b, op));
	}
}
