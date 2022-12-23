package org.mql.maven;

public class Calculator {
	
	public static final int ADDITION = 0;
	public static final int MULTIPLICATION = 1;
	public static final int DIVISION = 2;
	public static final int SOUSTRACTION = 3;
	
	public int calc(int a, int b, int op) {
		if(op == ADDITION) return a + b;
		if(op == MULTIPLICATION) return a * b;
		if(op == DIVISION) return a / b;
		if(op == SOUSTRACTION) return a - b;
		return 0;
	}
}
